package uva.poo.academia;

import java.util.ArrayList;

/**
 * 
 * @author Kave Heidarieh
 * @author Fco. Javier Herrero
 * Representa a los alumnos de una academia.
 *
 */
public class Alumno {
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
	 * Informa de la deuda de {@code Alumno}
	 * @return la cantidad que debe {@code Alumno}
	 */
	public double deuda(){
		double importeDeuda = 0;
		for(int i=0; i<Matricula.getListaMatriculas().size(); i++){
			if(getDni() == Matricula.getListaMatriculas().get(i).getAlumno().getDni()){
				if( !Matricula.getListaMatriculas().get(i).getPago()){
					importeDeuda += Matricula.getListaMatriculas().get(i).getCurso().getPrecioCurso();
				}
			}
		}
		return importeDeuda;
	}
	
	/**
	 * Devulve la lista de los cursos en los que se ha matriculado {@code Alumno}
	 * @return cursos en los que está matriculado {@code this}
	 */
	public String listaCursosMatriculados(){
		String listaCursos = new String();
		
		for(int i=0; i<Matricula.getListaMatriculas().size(); i++){
			if(getDni() == Matricula.getListaMatriculas().get(i).getAlumno().getDni())
				listaCursos += Matricula.getListaMatriculas().get(i).getCurso().toString() + "\n";
		}
		return listaCursos;
	}
	
	/**
	 * 
	 */
	public String getDni(){
		return dni;
	}
	
	/**
	 * Informa de la deuda del alumno
	 * @return devuelve la deuda del alumno.
	 */

	/**
	 * Imprime los atributos de alumno
	 * @return atributos de alumno
	 */
	@Override
	public String toString(){
		return "Nombre: " + nombre + "\n" + "primer apellido: " + apellido1 + ", segundo apellido: " + apellido2 +
				"\n" + "dni: " + dni;
	}
}
