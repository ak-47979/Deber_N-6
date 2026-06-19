package ec.edu.uce.application.service;

import java.util.List;

import ec.edu.uce.domain.model.Departamento;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.DepartamentoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DepartamentoService {
    @Inject
    private DepartamentoRepository departamentoRepository;

    public void insertar(Departamento departamento, List<Profesor> profesores) {
        departamento.setProfesores(profesores);

        departamentoRepository.insertar(departamento);

    }
}
