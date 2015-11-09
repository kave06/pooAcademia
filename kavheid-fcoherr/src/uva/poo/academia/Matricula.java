package uva.poo.academia;

import java.util.ArrayList;

import javax.naming.SizeLimitExceededException;

import uva.poo.academia.Curso.Idioma;

public class Matricula {
	
	private int numeroMatricula;
	private boolean pago;
	// guarda el id de cada matricula.
	private static ArrayList<Integer> idMatricula = new ArrayList<>();
	// guarda lista de las matriculas de cada alumno.
	private static ArrayList<Matricula> listaMatricula = new ArrayList<>();
	private Alumno alumno;
	private Curso curso;
	
	/**
	 * Inicializa matricula con parametros.
	 * @param alumno alumno que va a matricularse.
	 * @param curso al que se matricula el alumno.
	 */
	// TODO que hacemos si no puede matricularse
	// TODO geters en el constructor??
	public Matricula(Alumno alumno, Curso curso){
		
		if (curso.comprobacionMaxAlumnosCurso())
		{
			setAlumno(alumno);
			setCurso(curso);
			getCurso().añadirAlumnosCurso();
			numeroMatricula = idMatricula.size() + 1;
			idMatricula.add(numeroMatricula);
			pago = false;
			añadeMatricula();
		}
		
	}
	
	/**
	 * Añade {@code this Matricula} a listaMatricula
	 */
	public void añadeMatricula(){
		listaMatricula.add(this);
	}
	
	public void eliminaMatricula(){
		for(int i=0; i< idMatricula.size(); i++){
			if(idMatricula.get(i) == numeroMatricula) idMatricula.remove(i);
		}
//		for(i=0; i< listaMatricula.size(); i++){
//			
//			if(listaMatricula.get(i))
//		}
	}
	
	public void imprimeMatriculas(){
		for(int i=0; i<listaMatricula.size(); i++ ){
			System.out.println(listaMatricula.get(i));
		}
	}
	public String toString(){
		return "id matricula: " + numeroMatricula + "\n" +  alumno +"\n" + curso;
	}
	
	public void cambiaNivel(){
		int tmp = 4;
	}
	/**
	 * Devuelve la lista de matriculas de la academia.
	 * @return lista de matriculas.
	 */
	public static ArrayList<Matricula> getListaMatriculas(){
		return listaMatricula;
	}
	
	/**
	 * Devuelve el {@code Alumno}
	 * @return alumno
	 */
	public Alumno getAlumno(){
		return alumno;
	}
	
	public void setAlumno(Alumno alumno){
		this.alumno = alumno;
	}
	
	/**
	 * Devuelve el {@code Curso}
	 * @return curso
	 */
	public Curso getCurso(){
		return curso;
	}
	
	public void setCurso(Curso curso){
		this.curso = curso;
	}
	
	/**
	 * Devuelve  {@code pago}
	 * @return devuelve {@code pago}
	 */
	public boolean getPago(){
		return pago;
	}

	/**
	 * Cambia de estado el {@code this.pago}
	 */
	public void setPago(){
		pago = true;
	}

}
