package ec.edu.uce.application.service;

import java.util.List;

import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfesorService {

    @Inject
    private ProfesorRepository profesorRepository;

    
    public void guardar(Profesor profesor){
        this.profesorRepository.crear(profesor);
    }
    public void eliminar(Integer id){
        this.profesorRepository.eliminar(id);;
    }
    public Profesor seleccionarPorId(Integer id){
        return this.profesorRepository.seleccionarPorId(id);
    }

    public void actualizar(Profesor profesor){
        this.profesorRepository.actualizar(profesor);;
    }

    public List<Profesor> obtenerTodProfesor(Profesor profesor){
        return this.profesorRepository.seleccionarTodos();
    }

    public List<Profesor> seleccionarPorNombre(String nombre){
        return this.profesorRepository.seleccionarPorNombre(nombre);
    }

    public List<Profesor> seleccionarPorApellido(String apellido){
        return this.profesorRepository.seleccionarPorApellido(apellido);
    }

    public List<Profesor> seleccionarPorMateria(String materia){
        return this.profesorRepository.seleccionarPorMateria(materia);
    }
    
    //Busqueda por primera letra
    public List<Profesor> seleccionarPorNombreLike(String letra){
        return this.profesorRepository.seleccionarPorNombreLike(letra);
    }

     //Busqueda por ultima letra
    public List<Profesor> seleccionarPorFinalNombre(String letra){
        return this.profesorRepository.seleccionarPorFinalNombre(letra);
    }

    public Profesor seleccionarPorNumero(String numero){
        return this.profesorRepository.seleccionarPorNumero(numero);
    }
}
