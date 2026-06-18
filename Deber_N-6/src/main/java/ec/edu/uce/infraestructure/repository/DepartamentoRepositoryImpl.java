package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Departamento;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.DepartamentoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class DepartamentoRepositoryImpl implements DepartamentoRepository {

    @Inject
    private EntityManager em;

    @Override
    public void insertar(Departamento departamento) {
        this.em.persist(departamento);

        for (Profesor profesor : departamento.getProfesores()) {
            profesor.setDepartamento(departamento);
            this.em.merge(profesor);
        }
    }

}
