package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Horario;
import ec.edu.uce.domain.repository.HorarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class HorarioService {
    @Inject
    private HorarioRepository horarioRepository;
    public void guardar(Horario horario){
        this.horarioRepository.guardar(horario);
    }

   
}
