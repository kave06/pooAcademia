package uva.poo.academia;


import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author kave Heidarieh
 * @author Fco. Javier Herrero
 * Representa los cursos que tiene una determinada academia.
 */
// TODO codigo identificador numerico o con enum?
import java.util.Map;
public class Curso {
	
	private int id;
	private Idioma idioma;
	private int nivel;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalTime horaInicio;
	private int maximoAlumnos;
	private double precioMatricula;
//	private Map<Integer, Idioma> map = new HashMap<Integer, Idioma>();
	ArrayList<Integer> idCursos = new ArrayList<>();

	public Curso(Idioma idioma, int nivel, LocalDate fechaInicio, LocalDate fechaFin,
				LocalTime horaInicio, int maximoAlumnos,double precioMatricula){
		
		id = idCursos.size() +101;
		idCursos.add(id);
		this.idioma = idioma;
		this.nivel = nivel;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.maximoAlumnos = maximoAlumnos;
		this.precioMatricula = precioMatricula;
//		map.put(id, idioma);
	}
	
	
	/**
	 * 
	 * @author kave
	 *
	 */
	//TODO privado o publico?
	public enum Idioma {
		INGLES, FRANCES, ALEMAN, ESPAÑOL, CHINO
	}
	
	public int getNivel(){
		return nivel;
	}
	
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	
	

}
