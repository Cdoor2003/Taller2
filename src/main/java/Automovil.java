public class Automovil {
	private String marca;
	private String modelo;
	private int anhoFabricacion;
	private int precio;
	private Motor motor;
	private Chasis chasis;

	public Automovil(String marca, String modelo, int anhoFabricacion, int precio){
		this.marca = marca;
		this.modelo = modelo;
		this.anhoFabricacion = anhoFabricacion;
		this.precio = precio;
	}
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnhoFabricacion() {
		return this.anhoFabricacion;
	}

	public void setAnhoFabricacion(int anhoFabricacion) {
		this.anhoFabricacion = anhoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}