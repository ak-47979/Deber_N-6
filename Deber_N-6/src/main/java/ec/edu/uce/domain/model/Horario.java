package ec.edu.uce.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario  {
    @Id
    @SequenceGenerator(name = "seq_horario_generador",sequenceName = "seq_horario",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_horario_generador")
    @Column(name = "hora_id")
    private Integer id;

    @Column(name = "hora_dia")
    private String dia;

    @Column(name = "hora_Inicio")
    private LocalDateTime horaInicio;

    @Column(name = "hora_Fin")
    private LocalDateTime horaFin;

    

    public Horario(){
        
    }
    
    public Horario( String dia, LocalDateTime horaInicio, LocalDateTime horaFin) {
        
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }
    public LocalDateTime getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }
    @Override
    public String toString() {
        return "Horario [id=" + id + ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
    }
     
}
