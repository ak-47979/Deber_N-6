package ec.edu.uce;

import java.time.LocalDateTime;

import ec.edu.uce.application.service.HorarioService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Horario;
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
        private ProfesorService profesorService;
        @Inject
        private  HorarioService horarioService;
        @Override
        public int run(String... args) throws Exception {

            System.out.println("Conexion a la base de datos POSTGRES!");
            LocalDateTime timeInicio = LocalDateTime.of(2026, 11, 12, 7, 01, 56);
            LocalDateTime timeFin = LocalDateTime.of(2026, 11, 12, 14, 12, 12);
             Horario horario = new Horario("Lunes",timeInicio,timeFin );
            Profesor profesor = new Profesor( "Camila","Dalas",
                    "Quimica",
                    "0945324685",
                    "G",
                    "1712345378"
            );

            System.out.println("Guardadando datos");
            profesorService.guardarRe(profesor, horario);
            
            
            
            return 0;
        }

    }
}
