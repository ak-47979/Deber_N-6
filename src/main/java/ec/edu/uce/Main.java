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
             * // Named Query
             * // Buscar por nombre
             * System.out.println("=== Buscar por nombre ===");
             * List<Profesor> profesoresNombre =
             * profesorService.seleccionarPorNombreNamed("Paulina");
             * 
             * for (Profesor p : profesoresNombre) {
             * System.out.println(p);
             * }
             * 
             * // Buscar por cédula
             * System.out.println("\n=== Buscar por cédula ===");
             * Profesor profesorCedula =
             * profesorService.seleccionarPorCedulaNamed("0978644415");
             * 
             * if (profesorCedula != null) {
             * System.out.println(profesorCedula);
             * } else {
             * System.out.println("Profesor no encontrado");
             * }
             * 
             * // Buscar por género
             * System.out.println("\n=== Buscar por género ===");
             * List<Profesor> profesoresGenero =
             * profesorService.seleccionarPorGeneroNamed("M");
             * 
             * for (Profesor p : profesoresGenero) {
             * System.out.println(p);
             * }
             * 
             * // NATIVE QUERY POR NOMBRE
             * System.out.println("=== BUSCAR POR NOMBRE ===");
             * profesorService.seleccionarPorNombreNative("Pedro")
             * .forEach(System.out::println);
             * 
             * // NATIVE QUERY POR NÚMERO
             * System.out.println("\n=== BUSCAR POR NUMERO ===");
             * Profesor profesor = profesorService.seleccionarPorCedulaNative("1730513584");
             * 
             * if (profesor != null) {
             * System.out.println(profesor);
             * } else {
             * System.out.println("Profesor no encontrado");
             * }
             * 
             * // NATIVE QUERY POR GÉNERO
             * System.out.println("\n=== BUSCAR POR GENERO ===");
             * profesorService.seleccionarPorGeneroNative("G")
             * .forEach(System.out::println);
             */
            System.out.println("Seleccionar Tdos");
            System.out.println(profesorService.seleccionarTodosCriteria());
            System.out.println("Seleccionar por nombre");
            System.out.println(profesorService.seleccionarPorNombreCriteria("Paulina"));
            System.out.println("Seleccionar Dinamicamente");
            System.out.println(profesorService.seleccionarDinamica("Paulina", "Torres "));
            return 0;
        }

    }
}
