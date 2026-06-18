package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Horario}
 **/
@StaticMetamodel(Horario.class)
public abstract class Horario_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #dia
	 **/
	public static final String DIA = "dia";
	
	/**
	 * @see #horaInicio
	 **/
	public static final String HORA_INICIO = "horaInicio";
	
	/**
	 * @see #horaFin
	 **/
	public static final String HORA_FIN = "horaFin";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Horario}
	 **/
	public static volatile EntityType<Horario> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Horario#id}
	 **/
	public static volatile SingularAttribute<Horario, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Horario#dia}
	 **/
	public static volatile SingularAttribute<Horario, String> dia;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Horario#horaInicio}
	 **/
	public static volatile SingularAttribute<Horario, LocalDateTime> horaInicio;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Horario#horaFin}
	 **/
	public static volatile SingularAttribute<Horario, LocalDateTime> horaFin;

}

