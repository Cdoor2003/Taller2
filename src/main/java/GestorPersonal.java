import java.util.ArrayList;

public class GestorPersonal {
	private ArrayList<Persona> personas;
	private ArrayList<CorreoElectronico> correos;
	private ArrayList<Automovil> automoviles;

	public GestorPersonal(){
		this.personas = new ArrayList<>();
		this.correos = new ArrayList<>();
		this.automoviles = new ArrayList<>();
	}

	public ArrayList<Persona> getPersonas(){
		return personas;
	}

	public ArrayList<CorreoElectronico> getCorreos(){
		return correos;
	}

	public ArrayList<Automovil> getAutomoviles(){
		return automoviles;
	}

	public Persona buscarPersonas(String nombre, String apellido){
		for(Persona persona : this.personas){
			if(persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)){
				return persona;
			}
		}
		return null;
	}

	public String buscarPersonasPorNombre(String nombre){
		for(Persona persona : this.personas){
			if(persona.getNombre().equals(nombre)){
				return nombre;
			}
		}
		return null;
	}
	public int buscarPersonaPorRut(int rut){
		for(Persona persona : this.personas){
			if(persona.getRut() == rut){
				return rut;
			}
		}
		return Integer.parseInt(null);
	}

	public Automovil buscarMarcaDeAuto(String marca){
		for(Automovil automovil : this.automoviles){
			if(automovil.getMarca().equals(marca)){
				return automovil;
			}
		}
		return null;
	}

	public Automovil buscarAutomoviles(String marca, String modelo){
		for(Automovil automovil : this.automoviles){
			if(automovil.getMarca().equals(marca) && automovil.getModelo().equals(modelo)){
				return automovil;
			}
		}
		return null;
	}

	public CorreoElectronico buscarCorreos(String direccionCorreoElectronico, String proveedorCorreo){
		for(CorreoElectronico correo : this.correos){
			if(correo.getDireccionCorreoElectronico().equals(direccionCorreoElectronico) && correo.getProveedorCorreo().equals(proveedorCorreo)){
				return correo;
			}
		}
		return null;
	}

	public boolean agregarPersonas(String nombre,String apellido,int rut) {
		if(buscarPersonas(nombre,apellido) == null){
			Persona persona = new Persona(nombre,apellido,rut);
			this.personas.add(persona);
			System.out.println("Persona agregada.");
			return true;
		}
		else{
			System.out.println("La persona ya estaba agregada");
			return false;
		}
	}

	public boolean agregarCorreos(String direccionCorreoElectronico, String proveedorCorreo) {
		if(buscarCorreos(direccionCorreoElectronico,proveedorCorreo) == null){
			CorreoElectronico correo = new CorreoElectronico(direccionCorreoElectronico,proveedorCorreo);
			this.correos.add(correo);
			System.out.println("Correo agregado.");
			return true;
		}
		else{
			System.out.println("El correo ya estaba agregado");
			return false;
		}
	}

	public boolean agregarAutomoviles(String marca, String modelo, int añoFabricacion, int precio) {
		if(buscarAutomoviles(marca,modelo) == null){
		Automovil automovil = new Automovil(marca,modelo,añoFabricacion,precio);
		this.automoviles.add(automovil);
		System.out.println("Automovil agregado.");
		return true;
	}
	else{
		System.out.println("El automovil ya estaba agregado");
		return false;
	}
	}

	public void obtenerPersonasMarca(String marca) {

	}

	public void obtenerPersonaNombre(String nombre) {
		String nombrePersona ="";
		if(buscarPersonasPorNombre(nombre) != null){
			nombrePersona += buscarPersonasPorNombre(nombre);
			System.out.println(nombrePersona);
		}
		else {
			System.out.println("No se encontraron personas con ese nombre");
		}
	}

	public void obtenerPersonaRut(int rut) {
		int rutPersona = 0;
		if(buscarPersonaPorRut(rut) == rut){
			rutPersona += buscarPersonaPorRut(rut);
			System.out.println(rut);
		}
	}
}