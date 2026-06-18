package ec.edu.uce;

import java.time.LocalDate;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication   {

    @Inject
    private EstudianteService estudianteService;
    @Inject
    private ProfesorService profesorService;

        @Override
        public int run(String... args) throws Exception {
            
            System.out.println("Conexion a la base de datos POSTGRES!");
            
            //Creacion de un nuevo Estudiante
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("Andy");
            estudiante.setApellido("Suquilandi");
            estudiante.setFechaNacimiento(LocalDate.of(2004, 6, 23));
            estudiante.setGenero("M");
            
            //Guardar un nuevo estudiante
            System.out.println("Guardando un nuevo Estudiante...");
            estudianteService.guardar(estudiante);

            //Eliminar un estudiante por ID
            System.out.println("Eliminamos al Estudiante por ID");
            estudianteService.eliminar(2);
            
            //Metodo Actualizar
            System.out.println("Actualizar los Datos por ID...");
            Estudiante estudiante2 = this.estudianteService.buscarPorId(3);
            estudiante2.setNombre("Kenn");
            this.estudianteService.actualizar(estudiante2);

            //Buscar al Estudiante por ID
            System.out.println("Buscando Estudiante por ID...");
            System.out.println(estudianteService.buscarPorId(4).toString());
        
            //Profesor
            Profesor profesor = new Profesor();
            profesor.setNombre("Paul");
            profesor.setApellido("Paredes");
            profesor.setMateria("Analisis 1");
            profesor.setNumero("0954628542");
          
            //crear profesor
           profesorService.guardar(profesor);
            //buscar profesor
            Profesor prodesorBuscado = this.profesorService.seleccionarPorId(10 );
            System.out.println(prodesorBuscado);

            
            //actualizar profesor
            prodesorBuscado.setNombre("Alex");
            this.profesorService.actualizar(prodesorBuscado);
            System.out.println("Despues de actualizar: " + prodesorBuscado);
            //Eliminar profesor
            profesorService.eliminar(10);
            
            return 0;

            
        }

    }
}

