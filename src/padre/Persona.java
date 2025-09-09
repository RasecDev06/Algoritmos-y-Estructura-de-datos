package padre;

public class Persona {
	//Atributos privados:
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructor:
	public Persona(String nombre, String apellido, int edad) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//Getters/Setters:

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Operaciones publicas:
	public String generarCorreo() {
		return nombre + "." + apellido + "@cibertec.edu.pe";
	}
	
	public String datosDeLaPersona() {
		return "Nombre : " + nombre + "\n" +
			   "Apellido : " + apellido + "\n" +
			   "Edad : " + edad;	
	}
}








