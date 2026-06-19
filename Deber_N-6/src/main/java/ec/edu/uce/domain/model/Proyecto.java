package ec.edu.uce.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
    private LocalDateTime fechaIni; 

    @Column(name = "proy_fin")
    private LocalDateTime fechaFin;

    @ManyToMany(mappedBy = "proyectos")
    private List<Profesor> profesores = new ArrayList<>();

   

    public Proyecto() {
    }

    public Proyecto(String nombre, LocalDateTime fechaIni, LocalDateTime fechaFin) {
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

    public LocalDateTime getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDateTime fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Proyecto [id=" + id + ", nombre=" + nombre + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + "]";
    } 
    
}
