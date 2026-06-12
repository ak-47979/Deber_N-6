package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Horario;

public interface HorarioRepository {
    
public void asignar(Integer idProfesor, Horario horario);
public void guardar(Horario horario);
}
