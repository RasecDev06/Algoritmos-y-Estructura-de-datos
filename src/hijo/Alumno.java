package hijo;

import padre.Persona;

public class Alumno extends Persona{  // <-- extension de la clase padre: Persona
	//Atributos privados:
	private int nota1;
	private int nota2;
	private int nota3;
	
	//Constructor:
	public Alumno(String nombre, String apellido, int edad, int nota1,
			int nota2, int nota3) {
		//Super trae los atributos del padre:
		super(nombre, apellido, edad);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	//GET/SET:
	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {		//Valida que la nota este en un rango del 0 al 20
		if(nota1 >= 0 && nota1 <= 20) {
			this.nota1 = nota1;
		}else {
				System.out.println("Ingrese una nota de 0 a 20");
		}
		this.nota1 = nota1;
		
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		if(nota2 >= 0 && nota2 <= 20) {
			this.nota2 = nota2;
		}else {
				System.out.println("Ingrese una nota de 0 a 20");
		}
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		if(nota3 >= 0 && nota3 <= 20) {
			this.nota3 = nota3;
		}else {
				System.out.println("Ingrese una nota de 0 a 20");
		}
		this.nota3 = nota3;
	}
	
	//Operaciones publicas:
	public double promedio() {
		return (nota1 + nota2 + nota3) / 3.0;
	}
	
	public String datosCompletos() {
		return super.datosCompletos() + "\n" + //Se redifinio con super
			   "Nota 1 : " + nota1 + "\n" +
			   "Nota 2 : " + nota2 + "\n" +
			   "Nota 3 : " + nota3 + "\n";
	}	
}
