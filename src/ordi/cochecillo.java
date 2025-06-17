package ordi;

public class cochecillo {
	private String matricula;
	private String Modelo;
	private int NumeroPlazas;
	private double VelocidadMedia;
	private String TipoCombustible;
	private double Consumo;
	
	public cochecillo() {
		super();
	}

	public cochecillo(String matricula, String modelo, int numeroPlazas, double velocidadMedia, String tipoCombustible,
			double consumo) {
		super();
		this.matricula = matricula;
		Modelo = modelo;
		NumeroPlazas = numeroPlazas;
		VelocidadMedia = velocidadMedia;
		TipoCombustible = tipoCombustible;
		Consumo = consumo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getNumeroPlazas() {
		return NumeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		NumeroPlazas = numeroPlazas;
	}

	public double getVelocidadMedia() {
		return VelocidadMedia;
	}

	public void setVelocidadMedia(double velocidadMedia) {
		VelocidadMedia = velocidadMedia;
	}

	public String getTipoCombustible() {
		return TipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}

	public double getConsumo() {
		return Consumo;
	}

	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
	// Devuelve una representación en forma de cadena del objeto cochecillo.
    // Incluye los valores de los atributos principales del coche:
    // matrícula, modelo, número de plazas, velocidad media, tipo de combustible y consumo.
	
	@Override
	public String toString() {
		return "cochecillo [matricula=" + matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
				+ ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
				+ "]";
	}
	
	

}
