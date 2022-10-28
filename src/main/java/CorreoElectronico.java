public class CorreoElectronico {
	private String direccionCorreoElectronico;
	private String proveedorCorreo;

	public CorreoElectronico(String direccionCorreoElectronico,String proveedorCorreo){
		this.proveedorCorreo = proveedorCorreo;
		this.direccionCorreoElectronico = direccionCorreoElectronico;
	}
	public String getDireccionCorreoElectronico() {
		return this.direccionCorreoElectronico;
	}

	public void setDireccionCorreoElectronico(String direccionCorreoElectronico) {
		this.direccionCorreoElectronico = direccionCorreoElectronico;
	}

	public String getProveedorCorreo() {
		return this.proveedorCorreo;
	}

	public void setProveedorCorreo(String proveedorCorreo) {
		this.proveedorCorreo = proveedorCorreo;
	}
}