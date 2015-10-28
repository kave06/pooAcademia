import java.time.LocalDate;

import uva.poo.academia.*;
import uva.poo.academia.Curso.Idioma;
import java.time.*;


public class Lanzador {

	public static void main(String[] args) {
		
		
		Alumno alumno_uno = new Alumno("nombre", "apellido1", "apellido2", "dni");
		Curso c_dos = new Curso(Idioma.CHINO, 5, 2015, 5, 25, 2016, 3, 31, 10, 30, 20, 100);
		
		Matricula m_uno = new Matricula(alumno_uno, c_dos);
//		alumno_uno.hacerMatricula();
		m_uno.imprimeMatriculas();
		
//		LocalDate fecha = LocalDate.of(2015, 10, 15);
//		System.out.println(fecha);
//		System.out.println(uno);
//		System.out.println(c_dos);

	}

}
