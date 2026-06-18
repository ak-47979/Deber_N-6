package ec.edu.uce.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    @SequenceGenerator(name = "seq_proyecto_generador",sequenceName = "seq_proyecto", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_proyecto_generador")
    @Column(name = "proy_id")
    private Integer id;

    @Column(name = "proy_nombre")
    private String nombre;

    @Column(name = "proy_ini")
    private LocalDate fechaIni; 

    @Column(name = "proy_fin")
    private LocalDate fechaFin;

    @ManyToMany
    private Profesor profesor;

    public Proyecto() {
    }

    public Proyecto(String nombre, LocalDate fechaIni, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Proyecto [id=" + id + ", nombre=" + nombre + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + "]";
    } 
    
}
