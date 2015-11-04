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
	// Guarda el id de los cursos creados. Es unico para todos los cursos.
	private static ArrayList<Integer> idCursos = new ArrayList<>();
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public Curso(Idioma idioma, int nivel,int i_anyo, int i_mes, int i_dia, int f_anyo, int f_mes, int f_dia,
				int hora, int minutos, int maximoAlumnos,double precioMatricula){
		
		id = idCursos.size() +101;
		idCursos.add(id);
		this.idioma = idioma;
		this.nivel = nivel;
		this.fechaInicio = LocalDate.of(i_anyo, i_mes, i_dia);
		this.fechaFin = LocalDate.of(f_anyo, f_mes, f_dia);
		this.horaInicio = LocalTime.of(hora, minutos);
		this.maximoAlumnos = maximoAlumnos;
		this.precioMatricula = precioMatricula;
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
	
	public int getId(){
		return id;
	}
	
	public double getPrecioMatricula(){
		return precioMatricula;
	}
	
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	
	/**
	 * Devulve la lista de los cursos en los que se ha matriculado {@code this}
	 * @return cursos en los que está matriculado {@code this}
	 */
	public String listaAlumnosMatriculados(){
		String listaAlumnos = new String();
		
		for(int i=0; i<Matricula.getListaMatriculas().size(); i++){
			if(getId() == Matricula.getListaMatriculas().get(i).getCurso().getId())
				listaAlumnos += Matricula.getListaMatriculas().get(i).getAlumno().toString() + "\n";
		}
		return listaAlumnos;
	}
	
	
	/**
	 * Añade alumnos a la lista de alumnos que se inscriben en el curso.
	 * @param alumno que se inscribe en el curso.
	 */
	public void meteAlumno(Alumno alumno){
		listaAlumnos.add(alumno);
	}
	
	
	
	/**
	 * Imprime los atributos de curso
	 * @return atributos de curso
	 */
	@Override
	public String toString(){
		return "Id curso: " + id + ", Idioma: " + idioma + ", nivel: " + nivel +"\n"+
				"Fecha de inicio: " + fechaInicio + ", Fecha de fin: " + fechaFin + ", Hora: " + horaInicio +
				"\n" + "Numero máximo de Alumnos: " + maximoAlumnos + ", Precio de matrícula: " + precioMatricula;
				
	}
	
	

}
