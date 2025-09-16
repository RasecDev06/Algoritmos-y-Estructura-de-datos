package padre;

public abstract class Persona {   // Convirtiendo la clase Persona en clase abstracta
	
	public abstract String identificacion();   //Agregando un metodo bastracto
	
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
		if(edad > 0) {
			this.edad = edad;
		}else {
			System.out.println("Ingrese una edad positiva");
		}
		
	}
	
	//Operaciones publicas:
	public String generarCorreo() {
		return nombre + "." + apellido + "@cibertec.edu.pe";
	}
	
	public String datosCompletos() {
		return "Nombre : " + nombre + "\n" +
			   "Apellido : " + apellido + "\n" +
			   "Edad : " + edad;	
	}
}








