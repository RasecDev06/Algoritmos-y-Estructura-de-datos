package hijo;

import padre.Persona;

public class Docente extends Persona{ // <-- extension de la clase padre: Persona
	//Atributos privados:
	private int horas;
	private double tarifaPorHora;
	
	//Constructor:
	public Docente(String nombre, String apellido, int edad, int horas,
			double tarifaPorHora) {
		super(nombre, apellido, edad);
		this.horas = horas;
		this.tarifaPorHora = tarifaPorHora;
	}

	//GET/SET:
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifaPorHora() {
		return tarifaPorHora;
	}

	public void setTarifaPorHora(double tarifaPorHora) {
		this.tarifaPorHora = tarifaPorHora;
	}
	
	//Operaciones publicas:
	public double calcularSueldo() {
		return horas * tarifaPorHora;
	}
	
	public String datosCompletos() {
		return super.datosCompletos() + "\n" + //Se redifinio con super
		"Horas : " + horas + "\n" +
		"Tarifa por hora : " + tarifaPorHora;		
	}	
}
