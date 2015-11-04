import java.time.LocalDate;

import uva.poo.academia.*;
import uva.poo.academia.Curso.Idioma;
import java.time.*;


public class Lanzador {

	public static void main(String[] args) {
		
		
		Alumno alumno_uno = new Alumno("Kave", "Heidarieh", "Sorosh", "47286167F");
		Alumno a_dos = new Alumno("javier", "herrero", "garcia", "44914983M");
		
		Curso c_dos = new Curso(Idioma.CHINO, 5, 2015, 5, 25, 2016, 3, 31, 10, 30, 20, 100);
		Curso c_tres = new Curso(Idioma.ALEMAN, 3, 2015, 6, 30, 2016, 4, 15, 9,30, 30, 150 );
		Matricula m_uno = new Matricula(alumno_uno, c_dos);
		Matricula m_dos = new Matricula(alumno_uno, c_tres);
		Matricula m_tres = new Matricula(a_dos, c_tres);
//		System.out.println(c_dos.listaAlumnosMatriculados());
		
		
		System.out.println(a_dos.deuda());
		System.out.println(alumno_uno.deuda());
		m_tres.setPago();
		System.out.println(a_dos.deuda());
//		alumno_uno.hacerMatricula();
		//m_uno.imprimeMatriculas();
		
//		System.out.println(alumno_uno.listaCursosMatriculados());
//		System.out.println(a_dos.listaCursosMatriculados());
//		m_dos.ge
//		Matricula.
//		LocalDate fecha = LocalDate.of(2015, 10, 15);
//		System.out.println(fecha);
//		System.out.println(uno);
//		System.out.println(c_dos);
		
		

	}

}
