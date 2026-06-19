package ec.edu.uce.domain.model;

import jakarta.persistence.TypedQueryReference;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Profesor}
 **/
@StaticMetamodel(Profesor.class)
public abstract class Profesor_ {

	
	/**
	 * @see #Id
	 **/
	public static final String ID = "Id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #apellido
	 **/
	public static final String APELLIDO = "apellido";
	
	/**
	 * @see #materia
	 **/
	public static final String MATERIA = "materia";
	
	/**
	 * @see #numero
	 **/
	public static final String NUMERO = "numero";
	
	/**
	 * @see #genero
	 **/
	public static final String GENERO = "genero";
	
	/**
	 * @see #cedula
	 **/
	public static final String CEDULA = "cedula";
	
	/**
	 * @see #horario
	 **/
	public static final String HORARIO = "horario";
	
	/**
	 * @see #departamento
	 **/
	public static final String DEPARTAMENTO = "departamento";
	
	/**
	 * @see #proyectos
	 **/
	public static final String PROYECTOS = "proyectos";
	
	/**
	 * @see #_Profesor_buscarPorNombre_
	 **/
	public static final String QUERY_PROFESOR_BUSCAR_POR_NOMBRE = "Profesor.buscarPorNombre";
	
	/**
	 * @see #_Profesor_buscarPorCedula_
	 **/
	public static final String QUERY_PROFESOR_BUSCAR_POR_CEDULA = "Profesor.buscarPorCedula";
	
	/**
	 * @see #_Profesor_buscarPorGenero_
	 **/
	public static final String QUERY_PROFESOR_BUSCAR_POR_GENERO = "Profesor.buscarPorGenero";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Profesor}
	 **/
	public static volatile EntityType<Profesor> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#Id}
	 **/
	public static volatile SingularAttribute<Profesor, Integer> Id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#nombre}
	 **/
	public static volatile SingularAttribute<Profesor, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#apellido}
	 **/
	public static volatile SingularAttribute<Profesor, String> apellido;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#materia}
	 **/
	public static volatile SingularAttribute<Profesor, String> materia;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#numero}
	 **/
	public static volatile SingularAttribute<Profesor, String> numero;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#genero}
	 **/
	public static volatile SingularAttribute<Profesor, String> genero;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#cedula}
	 **/
	public static volatile SingularAttribute<Profesor, String> cedula;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#horario}
	 **/
	public static volatile SingularAttribute<Profesor, Horario> horario;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#departamento}
	 **/
	public static volatile SingularAttribute<Profesor, Departamento> departamento;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Profesor#proyectos}
	 **/
	public static volatile ListAttribute<Profesor, Proyecto> proyectos;
	
	/**
	 * The query named {@value QUERY_PROFESOR_BUSCAR_POR_NOMBRE}
	 *
	 * @see ec.edu.uce.domain.model.Profesor
	 **/
	public static volatile TypedQueryReference<Object> _Profesor_buscarPorNombre_;
	
	/**
	 * The query named {@value QUERY_PROFESOR_BUSCAR_POR_CEDULA}
	 *
	 * @see ec.edu.uce.domain.model.Profesor
	 **/
	public static volatile TypedQueryReference<Object> _Profesor_buscarPorCedula_;
	
	/**
	 * The query named {@value QUERY_PROFESOR_BUSCAR_POR_GENERO}
	 *
	 * @see ec.edu.uce.domain.model.Profesor
	 **/
	public static volatile TypedQueryReference<Object> _Profesor_buscarPorGenero_;

}

