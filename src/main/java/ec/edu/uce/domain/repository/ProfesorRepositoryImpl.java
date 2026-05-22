package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Profesor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProfesorRepositoryImpl implements ProfesorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Profesor profesor) {
        this.em.persist(profesor);
        System.out.println("Se creo en la base al profesor: "+ profesor.getNombre());
    }

    @Override
    public Profesor seleccionarPorId(Integer id) {
        return this.em.find(Profesor.class, id);
    }

    @Override
    public void actualizar(Profesor profesor) {
        this.em.merge(profesor);
                
        System.out.println("Se actualizo al profesor: "+profesor.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(id);        
        System.out.println("Se elimino al profesor con Id: "+id);
    }

}
