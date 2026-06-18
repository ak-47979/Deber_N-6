package ec.edu.uce;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.application.service.DepartamentoService;
import ec.edu.uce.application.service.HorarioService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Departamento;
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
        private DepartamentoService departamentoService;
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
            Horario horario1 = new Horario("Lunes",LocalDateTime.now(),timeFin );
            Profesor profesor = new Profesor( "Camila","Dalas",
                    "Quimica",
                    "0945324685",
                    "G",
                    "1712345378"
            );

             Profesor profesor1 = new Profesor( "Andy","Suquilandi",
                    "Quimica",
                    "0945326185",
                    "M",
                    "1717345128"
            );

            List<Profesor> profesores = new ArrayList<>();
            profesores.add(profesor1);
            profesores.add(profesor);
            Departamento departamento = new Departamento();

             
           
           
            System.out.println("Guardadando datos");
            profesorService.guardarRe(profesor, horario);
            profesorService.guardarRe(profesor1, horario1);
            departamento.setNombre("Departamento de Quimica");
            departamentoService.insertar(departamento, profesores);
           
            
            return 0;
        }

    }
}
