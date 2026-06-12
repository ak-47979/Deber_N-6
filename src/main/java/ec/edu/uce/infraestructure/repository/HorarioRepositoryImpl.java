package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Horario;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.HorarioRepository;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class HorarioRepositoryImpl implements HorarioRepository {

    @Inject
    private EntityManager em;

    @Override
    public void asignar(Integer idProfesor, Horario horario) {

        Profesor profesor = this.em.find(Profesor.class, idProfesor);

        if (profesor == null) {
            System.out.println("No existe profesor con id: " + idProfesor);
        }

        profesor.setHorario(horario);

        em.merge(profesor);

    }

    @Override
    public void guardar(Horario horario) {
        this.em.persist(horario);
    }

}
