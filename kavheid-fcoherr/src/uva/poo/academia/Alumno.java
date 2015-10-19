package uva.poo.academia;

import java.util.ArrayList;

/**
 * 
 * @author kave Heidarieh
 * @author Fco. Javier Herrero
 * Representa a los alumnos de una academia.
 *
 */
public class Alumno {
	//arrayList con los cursos>
	private ArrayList<Curso> listaCurso;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	
	// TODO comprobacion correccion de dni?
	public Alumno(String nombre, String apellido1, String apellido2, String dni){
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
	}
	
	/**
	 * Añade un curso al alumno.
	 * @param curso, añade el curso a la lista de cursos del alumno
	 */
	public void añadeCurso(Curso curso){
		listaCurso.add(curso);
	}
	
	//public void añadeMatricula()
	
	/**
	 * Informa de la deuda del alumno
	 * @return devuelve la deuda del alumno.
	 */

}
