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
	private int MAXIMO_ALUMNOS;
	private int alumnosMatriculados;
	private double precioCurso;
	// Guarda el id de los cursos creados. Es unico para todos los cursos.
	private static ArrayList<Curso> cursos = new ArrayList<>();
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public Curso(Idioma idioma, int nivel,int i_anyo, int i_mes, int i_dia, int f_anyo, int f_mes, int f_dia,
				int hora, int minutos, int maximoAlumnos,double precioMatricula){
		
		id = cursos.size() +101;
		this.idioma = idioma;
		this.nivel = nivel;
		this.fechaInicio = LocalDate.of(i_anyo, i_mes, i_dia);
		this.fechaFin = LocalDate.of(f_anyo, f_mes, f_dia);
		this.horaInicio = LocalTime.of(hora, minutos);
		this.MAXIMO_ALUMNOS = maximoAlumnos;
		this.precioCurso = precioMatricula;
		añadeCurso();
	}
	
	/**
	 * Idiomas que imparte la academia.
	 */
	public enum Idioma {
		INGLES, FRANCES, ALEMAN, ESPAÑOL, CHINO
	}
	
//	public int getNivel(){
//		return nivel;
//	}
	
	/**
	 * Devuelve el id de {@code Curso}
	 * @return id, id del {@code Curso}
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * Devuelve el precios de {@code this Curso}
	 * @return precio curso el precio de {@code Curso}
	 */
	public double getPrecioCurso(){
		return precioCurso;
	}
	
	/**
	 * Devuelve la el numero de alumnos matriculados en un {@code this Curso}
	 * @return alumnos matriculados Devuelve el numero de alumnos matriculados
	 * en {@code this Curso}
	 */
	public int getAlumnosMatriculados(){
		return alumnosMatriculados;
	}
	
	/**
	 * Devuelve la constante de numero maximo de alumnos para
	 * {@code this Curso}
	 * @return maximo alumnos Devuelve el numero maximo de alumnos
	 * por {@code this Curso}
	 */
	public int getMAXIMO_ALUMNOS(){
		return MAXIMO_ALUMNOS;
	}
//	
//	public void setNivel(int nivel){
//		this.nivel = nivel;
//	}
	
	/**
	 * Pone {@code this alumnosMatriculados}
	 * @param matriculados numero de alumnos matriculados
	 */
	public void setAlumnosMatriculados(int matriculados){
		alumnosMatriculados = matriculados;
	}
	
	/**
	 * Añade {@code this Curso} a una lista de cursos.
	 * @param curso
	 */
	public void añadeCurso(){
		cursos.add(this);
	}
	
	/**
	 * Añade un alumno al numero de alumnos matriculados en {@code this Curso}
	 */
	public void añadirAlumnosCurso(){
		setAlumnosMatriculados(getAlumnosMatriculados()+1);
	}
	
	/**
	 * Comprueba que queden plazas en {@code Curso}
	 * @return true si hay plazas false si no hay plazas en {@code this Curso}
	 */
	public boolean comprobacionMaxAlumnosCurso(){
		if(getMAXIMO_ALUMNOS() > getAlumnosMatriculados())
			return true;
		else return false;
	}
	
//	/**
//	 * Devulve la lista de los cursos en los que se ha matriculado {@code this}
//	 * @return cursos en los que está matriculado {@code this}
//	 */
//	public String listaAlumnosMatriculados(){
//		String listaAlumnos = new String();
//		
//		for(int i=0; i<Matricula.getListaMatriculas().size(); i++){
//			if(getId() == Matricula.getListaMatriculas().get(i).getCurso().getId())
//				listaAlumnos += Matricula.getListaMatriculas().get(i).getAlumno().toString() + "\n";
//		}
//		return listaAlumnos;
//	}
	
	
	/**
	 * Añade alumnos a la lista de alumnos que se inscriben en el curso.
	 * @param alumno que se inscribe en el curso.
	 */
	public void añadeAlumno(Alumno alumno){
		listaAlumnos.add(alumno);
	}
	
	/**
	 * Comprueba que {@code Alumno} no este en el mismo {@code Curso} repetido.
	 * @param alumno alumno a comprobar que no este repetido en {@code Curso}
	 * @return true si no esta repetido y false si {@code Alumno}ya esta en el
	 * {@code Curso}
	 */
	public boolean comprobacionAlumnoRepetido(Alumno alumno){
		for(int i=0; i<listaAlumnos.size(); i++)
			if(listaAlumnos.get(i).getDni() == alumno.getDni())
				return false;
		return true;
	}
	
	/**
	 * Devuleve la lista de los {@code Alumno} de {@code Curso}
	 * @return lista de {@code Alumno} del {@code Curso}
	 */
	public String imprimeAlumnos(){
		String alumnos="";
		for(int i=0; i<listaAlumnos.size(); i++){
			alumnos += listaAlumnos.get(i).toString();
		}
		return alumnos;
	}
	
	/**
	 * Devulve la lista de los cursos
	 * @return
	 */
	public static String imprimeListaCursosyAlumnos(){
		String aux = "";
		for(int i=0; i<cursos.size(); i++){
			aux += cursos.get(i).toString() + cursos.get(i).imprimeAlumnos();
		}
		return aux;
	}
	
	
	
	/**
	 * Imprime los atributos de curso
	 * @return atributos de curso
	 */
	@Override
	public String toString(){
		return "Id curso: " + id + ", Idioma: " + idioma + ", nivel: " + nivel +"\n"+
				"Fecha de inicio: " + fechaInicio + ", Fecha de fin: " + fechaFin + ", Hora: " + horaInicio +
				"\n" + "Numero máximo de Alumnos: " + MAXIMO_ALUMNOS + ", Precio de matrícula: " + precioCurso;
				
	}
	
	

}
