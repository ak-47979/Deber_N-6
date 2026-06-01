package ec.edu.uce.domain.repository;

import java.util.List;

import ec.edu.uce.domain.model.Profesor;

public interface ProfesorRepository {
    public void crear(Profesor profesor);

    public Profesor seleccionarPorId(Integer id);

    public void actualizar(Profesor profesor);

    public void eliminar(Integer id);

    // Consultas
    public List<Profesor> seleccionarTodos();

    public List<Profesor> seleccionarPorNombre(String nombre);

    public List<Profesor> seleccionarPorApellido(String apellido);

    public List<Profesor> seleccionarPorMateria(String materia);

    // Busqueda por primera letra
    public List<Profesor> seleccionarPorNombreLike(String letra);

    // Busqueda por ultima letra
    public List<Profesor> seleccionarPorFinalNombre(String letra);

    public Profesor seleccionarPorNumero(String numero);

    //Named Query 
    public List<Profesor> seleccionarPorNombreNamed(String nombre);

    public Profesor seleccionarPorCedulaNamed(String cedula);

    public List<Profesor> seleccionarPorGeneroNamed(String genero);

}
