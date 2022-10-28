public class Motor {
	private int numeroMotor;
	private int centrimetrosCubicos;

	public Motor(int numeroMotor,int centrimetrosCubicos){
		this.numeroMotor = numeroMotor;
		this.centrimetrosCubicos = centrimetrosCubicos;
	}
	public int getNumeroMotor() {
		return this.numeroMotor;
	}

	public void setNumeroMotor(int numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public int getCentrimetrosCubicos() {
		return this.centrimetrosCubicos;
	}

	public void setCentrimetrosCubicos(int centrimetrosCubicos) {
		this.centrimetrosCubicos = centrimetrosCubicos;
	}
}