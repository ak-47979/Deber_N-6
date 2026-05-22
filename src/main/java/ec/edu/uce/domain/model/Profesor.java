package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "profesor")
public class Profesor {
    
    @SequenceGenerator(name = "seq_profesor_generador", sequenceName = "seq_profesor", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profesor_generador")
    @Id
    private Integer Id;
    @Column(name = "prof_nombre")
    private String nombre;

    @Column(name = "prof_apellido")
    private String apellido;

    @Column(name = "prof_materia")
    private String materia;

    @Column(name = "prof_numero")
    private String numero;

    public Profesor(){

    }
    public Profesor(Integer id, String nombre, String apellido, String materia, String numero) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.numero = numero;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Profesor [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia
                + ", numero=" + numero + "]";
    }
    
}
