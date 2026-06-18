package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Proyecto}
 **/
@StaticMetamodel(Proyecto.class)
public abstract class Proyecto_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #fechaIni
	 **/
	public static final String FECHA_INI = "fechaIni";
	
	/**
	 * @see #fechaFin
	 **/
	public static final String FECHA_FIN = "fechaFin";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Proyecto}
	 **/
	public static volatile EntityType<Proyecto> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Proyecto#id}
	 **/
	public static volatile SingularAttribute<Proyecto, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Proyecto#nombre}
	 **/
	public static volatile SingularAttribute<Proyecto, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Proyecto#fechaIni}
	 **/
	public static volatile SingularAttribute<Proyecto, LocalDate> fechaIni;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Proyecto#fechaFin}
	 **/
	public static volatile SingularAttribute<Proyecto, LocalDate> fechaFin;

}

