package ec.edu.uce.application.service;

import java.util.List;

import ec.edu.uce.domain.model.Horario;
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
    //Named Query
     public List<Profesor> seleccionarPorNombreNamed(String nombre){
        return this.profesorRepository.seleccionarPorNombreNamed(nombre);
     }
    public Profesor seleccionarPorCedulaNamed(String cedula){
        return this.profesorRepository.seleccionarPorCedulaNamed(cedula);
    }
    public List<Profesor> seleccionarPorGeneroNamed(String genero){
        return this.profesorRepository.seleccionarPorGeneroNamed(genero);
    }

     //Native Query
     public List<Profesor> seleccionarPorNombreNative(String nombre){
        return this.profesorRepository.seleccionarPorNombreNative(nombre);
     }
    public Profesor seleccionarPorCedulaNative(String cedula){
        return this.profesorRepository.seleccionarPorCedulaNative(cedula);
    }
    public List<Profesor> seleccionarPorGeneroNative(String genero){
        return this.profesorRepository.seleccionarPorGeneroNative(genero);
}
    //criteriaQuery
    public List<Profesor> seleccionarTodosCriteria(){
        return this.profesorRepository.seleccionarTodosCriteria();
    }
    
    public List<Profesor> seleccionarPorNombreCriteria(String nombre){
        return this.profesorRepository.seleccionarPorNombreCriteria(nombre);
    }


    public List<Profesor> seleccionarDinamica(String nombre, String apellido){
        return this.profesorRepository.seleccionarDinamica(nombre, apellido);
    }

    //one to one
    public void guardarRe(Profesor profesor, Horario horario){
        this.profesorRepository.guardar(profesor, horario);
    }
    
}
