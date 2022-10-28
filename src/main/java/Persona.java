import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int rut;
	private ArrayList<CorreoElectronico> correosElectronicos = new ArrayList<CorreoElectronico>();
	private ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	public Persona(String nombre,String apellido,int rut){
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.correosElectronicos = new ArrayList<>();
		this.automoviles = new ArrayList<>();
	}

	public ArrayList<Automovil> getAutomoviles(){
		return this.automoviles;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}
}