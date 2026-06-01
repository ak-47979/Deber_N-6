package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
@Entity
@Table(name = "profesor")

@NamedQueries({
    @NamedQuery(
        name = "Profesor.buscarPorNombre",
        query = "SELECT p FROM Profesor p WHERE p.nombre = :nombre"
    ),
    @NamedQuery(
        name = "Profesor.buscarPorCedula",
        query = "SELECT p FROM Profesor p WHERE p.cedula = :cedula"
    ),
    @NamedQuery(
        name = "Profesor.buscarPorGenero",
        query = "SELECT p FROM Profesor p WHERE p.genero = :genero"
    )
})
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
    @Column(name = "prof_genero")
    private String genero;
    @Column(name ="prof_cedula")
    private String cedula;
    public Profesor(){

    }
    public Profesor(Integer id, String nombre, String apellido, String materia, String numero, String genero,
            String cedula) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.numero = numero;
        this.genero = genero;
        this.cedula = cedula;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Profesor [Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia
                + ", numero=" + numero + ", genero=" + genero + ", cedula=" + cedula + "]";
    }

   
    
}
