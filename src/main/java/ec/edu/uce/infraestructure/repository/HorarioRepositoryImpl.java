package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Horario;
import ec.edu.uce.domain.repository.HorarioRepository;
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
    public void guardar(Horario horario) {
        this.em.persist(horario);
    }

}
