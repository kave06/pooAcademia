package uva.poo.academia;

import java.util.ArrayList;

public class Matricula {
	
	private int numeroMatricula;
	private boolean pago;
	private ArrayList<Integer> idMatricula = new ArrayList<>();
	
	
	public Matricula(){
		numeroMatricula = idMatricula.size() + 1;
		idMatricula.add(numeroMatricula);
		pago = false;
	}
	
	
	public void cambiaNivel(){
		int tmp = 4;
	}

}
