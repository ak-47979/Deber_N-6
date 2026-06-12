package ec.edu.uce.infraestructure.repository;

import java.util.ArrayList;
import java.util.List;


import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Horario;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import jakarta.persistence.criteria.Predicate;
@ApplicationScoped
@Transactional
public class ProfesorRepositoryImpl implements ProfesorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Profesor profesor) {
        this.em.persist(profesor);
        System.out.println("Se creo en la base al profesor: " + profesor.getNombre());
    }

    @Override
    public Profesor seleccionarPorId(Integer id) {
        return this.em.find(Profesor.class, id);
    }

    @Override
    public void actualizar(Profesor profesor) {
        this.em.merge(profesor);

        System.out.println("Se actualizo al profesor: " + profesor.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));
        System.out.println("Se elimino al profesor con Id: " + id);

    }

    @Override
    public List<Profesor> seleccionarTodos() {
        TypedQuery<Profesor> profesores = this.em.createQuery("SELECT p FROM Profesor p ", Profesor.class);

        return profesores.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorNombre(String nombre) {
        TypedQuery<Profesor> miProfeNom = this.em.createQuery("SELECT p FROM Profesor p WHERE p.nombre = :nombre1 ",
                Profesor.class);
        miProfeNom.setParameter("nombre1", nombre);
        return miProfeNom.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorApellido(String apellido) {
        TypedQuery<Profesor> miProfeApe = this.em.createQuery("SELECT p FROM Profesor p WHERE p.apellido = :apellido1 ",
                Profesor.class);
        miProfeApe.setParameter("apellido1", apellido);
        return miProfeApe.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorMateria(String materia) {
        TypedQuery<Profesor> miProfeMateria = this.em.createQuery("select p from Profesor p Where materia = :materia1",
                Profesor.class);
        miProfeMateria.setParameter("materia1", materia);
        return miProfeMateria.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorNombreLike(String letra) {
        return em.createQuery(
                "SELECT p FROM Profesor p WHERE p.nombre LIKE :letra1",
                Profesor.class)
                .setParameter("letra1", letra + "%")
                .getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorFinalNombre(String letra) {
        return em.createQuery(
                "SELECT p FROM Profesor p WHERE p.nombre LIKE :letra1",
                Profesor.class)
                .setParameter("letra1", "%" + letra)
                .getResultList();
    }

    @Override
    public Profesor seleccionarPorNumero(String numero) {

        TypedQuery<Profesor> telefonoQuery = this.em.createQuery(
                "SELECT p FROM Profesor p WHERE p.numero = :numero",
                Profesor.class);

        telefonoQuery.setParameter("numero", numero);
        telefonoQuery.setMaxResults(1);

        List<Profesor> lista = telefonoQuery.getResultList();

        if (lista.isEmpty()) {
            return null;
        }

        return lista.get(0);
    }

    @Override
    public List<Profesor> seleccionarPorNombreNamed(String nombre) {

        return this.em.createNamedQuery(
                "Profesor.buscarPorNombre", Profesor.class)
                .setParameter("nombre", nombre)
                .getResultList();
    }

    @Override
    public Profesor seleccionarPorCedulaNamed(String cedula) {

        try {
            return this.em.createNamedQuery(
                    "Profesor.buscarPorCedula", Profesor.class)
                    .setParameter("cedula", cedula)
                    .setMaxResults(1)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Profesor> seleccionarPorGeneroNamed(String genero) {

        return this.em.createNamedQuery(
                "Profesor.buscarPorGenero", Profesor.class)
                .setParameter("genero", genero)
                .getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorNombreNative(String nombre) {
        String sql = """
                SELECT *
                FROM profesor
                WHERE prof_nombre = :nombre
                """;
        return this.em.createNativeQuery(sql, Profesor.class)
                .setParameter("nombre", nombre)
                .getResultList();
    }

    @Override
    public Profesor seleccionarPorCedulaNative(String cedula) {

        String sql = "SELECT * FROM profesor WHERE prof_cedula = :cedula";

        try {
            return (Profesor) this.em.createNativeQuery(sql, Profesor.class)
                    .setParameter("cedula", cedula)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Profesor> seleccionarPorGeneroNative(String genero) {
        String sql = "SELECT * FROM profesor WHERE prof_genero = :genero";
        return this.em.createNativeQuery(sql, Profesor.class)
                .setParameter("genero", genero)
                .getResultList();
    }

    @Override
    public List<Profesor> seleccionarTodosCriteria() {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery myQuery = cb.createQuery(Profesor.class);
        Root<Profesor> root = myQuery.from(Profesor.class);

        TypedQuery<Profesor> query = this.em.createQuery(myQuery);
        return query.getResultList();

    }

    @Override
    public List<Profesor> seleccionarPorNombreCriteria(String nombre) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();

    CriteriaQuery<Profesor> myQuery = cb.createQuery(Profesor.class);

    Root<Profesor> root = myQuery.from(Profesor.class);
    Predicate condicion = cb.equal(root.get("nombre"), nombre);

    myQuery.select(root);
    myQuery.where(condicion);

    TypedQuery<Profesor> query = this.em.createQuery(myQuery);

    return query.getResultList();
    }

    @Override
    public List<Profesor> seleccionarDinamica(String nombre, String apellido) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery mQuery = cb.createQuery(Profesor.class);
        Root<Profesor> root = mQuery.from(Profesor.class);
        Predicate nombreV = cb.equal(root.get("nombre"),nombre);
        Predicate apellidoV = cb.equal(root.get("apellido"), apellido);
        List<Predicate> condiciones = new ArrayList<>();
        condiciones.add(nombreV);
        condiciones.add(apellidoV);
        mQuery.where(condiciones);
        TypedQuery<Profesor> con = this.em.createQuery(mQuery);
        return con.getResultList();
    }

    
}
