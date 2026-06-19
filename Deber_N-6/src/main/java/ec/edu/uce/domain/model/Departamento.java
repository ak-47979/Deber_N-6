package ec.edu.uce.domain.model;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")

public class Departamento {
    @Id
    @SequenceGenerator(name = "seq_departamento_generador", sequenceName = "seq_departamento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_departamento_generador")
    @Column(name = "depa_id")
    private Integer id;
    @Column(name = "depa_nombre")
    private String nombre;

    @OneToMany(mappedBy = "departamento")
    private List<Profesor> profesores = new ArrayList<>();;

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

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Departamento(String nombre, List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public Departamento() {
    }

    @Override
    public String toString() {
        return "Departamento [id=" + id + ", nombre=" + nombre + "]";
    }

}
