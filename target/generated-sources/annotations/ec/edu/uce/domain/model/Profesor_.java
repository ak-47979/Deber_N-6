package ec.edu.uce.domain.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Profesor}
 **/
@StaticMetamodel(Profesor.class)
@Generated("org.hibernate.processor.HibernateProcessor")
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

}

