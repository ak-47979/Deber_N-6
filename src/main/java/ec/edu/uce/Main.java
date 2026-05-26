package ec.edu.uce;


import java.util.List;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.application.service.ProfesorService;

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

    public static class App implements QuarkusApplication {

        @Inject
        private EstudianteService estudianteService;
        @Inject
        private ProfesorService profesorService;

        @Override
        public int run(String... args) throws Exception {

            System.out.println("Conexion a la base de datos POSTGRES!");
            /*
             * //Creacion de un nuevo Estudiante
             * Estudiante estudiante = new Estudiante();
             * estudiante.setNombre("Andy");
             * estudiante.setApellido("Suquilandi");
             * estudiante.setFechaNacimiento(LocalDate.of(2004, 6, 23));
             * estudiante.setGenero("M");
             * 
             * //Guardar un nuevo estudiante
             * System.out.println("Guardando un nuevo Estudiante...");
             * estudianteService.guardar(estudiante);
             * 
             * //Eliminar un estudiante por ID
             * System.out.println("Eliminamos al Estudiante por ID");
             * estudianteService.eliminar(2);
             * 
             * //Metodo Actualizar
             * System.out.println("Actualizar los Datos por ID...");
             * Estudiante estudiante2 = this.estudianteService.buscarPorId(3);
             * estudiante2.setNombre("Kenn");
             * this.estudianteService.actualizar(estudiante2);
             * 
             * //Buscar al Estudiante por ID
             * System.out.println("Buscando Estudiante por ID...");
             * System.out.println(estudianteService.buscarPorId(4).toString());
             * 
             * //Profesor
             * Profesor profesor = new Profesor();
             * profesor.setNombre("Camilo");
             * profesor.setApellido("Torres");
             * profesor.setMateria("Visualizacion");
             * profesor.setNumero("0978644415");
             * 
             * //crear profesor
             * profesorService.guardar(profesor);
             * 
             * //buscar profesor
             * Profesor prodesorBuscado = this.profesorService.seleccionarPorId(10 );
             * System.out.println(prodesorBuscado);
             * 
             * 
             * //actualizar profesor
             * prodesorBuscado.setNombre("Alex");
             * this.profesorService.actualizar(prodesorBuscado);
             * System.out.println("Despues de actualizar: " + prodesorBuscado);
             * //Eliminar profesor
             * profesorService.eliminar(10);
             */
            // BUSCAR POR NOMBRE
            List<Profesor> profesoresNombre = this.profesorService.seleccionarPorNombre("Pedro");

            System.out.println("Busqueda por nombre:");

            for (Profesor p : profesoresNombre) {
                System.out.println(p.toString());
            }

            // BUSCAR POR APELLIDO

            List<Profesor> profesoresApellido = this.profesorService.seleccionarPorApellido("Perez");

            System.out.println("Busqueda por apellido:");

            for (Profesor p : profesoresApellido) {
                System.out.println(p.toString());
            }

            // BUSCAR POR MATERIA
            List<Profesor> profesoresMateria = this.profesorService.seleccionarPorMateria("Programacion");

            System.out.println("Busqueda por materia:");

            for (Profesor p : profesoresMateria) {
                System.out.println(p.toString());
            }

            // BUSCAR POR PRIMERA LETRA
            List<Profesor> profesoresInicial = this.profesorService.seleccionarPorNombreLike("C");

            System.out.println("Profesores que empiezan con A:");

            for (Profesor p : profesoresInicial) {
                System.out.println(p.toString());
            }

            // BUSCAR POR ULTIMA LETRA
            List<Profesor> profesoresFinal = this.profesorService.seleccionarPorFinalNombre("o");

            System.out.println("Profesores que terminan con o:");

            for (Profesor p : profesoresFinal) {
                System.out.println(p.toString());
            }

            // BUSCAR POR NUMERO
            Profesor profesorNumero = this.profesorService.seleccionarPorNumero("0978644415");

            System.out.println("Busqueda por numero:");

            System.out.println(profesorNumero.toString());
            return 0;
        }

    }
}
