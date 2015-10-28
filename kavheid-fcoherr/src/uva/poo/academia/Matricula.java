package uva.poo.academia;

import java.util.ArrayList;

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
	
	public Matricula(Alumno alumno, Curso curso){
		
		this.alumno = alumno;
		this.curso = curso;
		
		numeroMatricula = idMatricula.size() + 1;
		idMatricula.add(numeroMatricula);
		pago = false;
		listaMatricula.add(this);
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

}
