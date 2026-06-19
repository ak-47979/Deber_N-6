package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Departamento}
 **/
@StaticMetamodel(Departamento.class)
public abstract class Departamento_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #profesores
	 **/
	public static final String PROFESORES = "profesores";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Departamento}
	 **/
	public static volatile EntityType<Departamento> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Departamento#id}
	 **/
	public static volatile SingularAttribute<Departamento, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Departamento#nombre}
	 **/
	public static volatile SingularAttribute<Departamento, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Departamento#profesores}
	 **/
	public static volatile ListAttribute<Departamento, Profesor> profesores;

}

