package clases;

import java.util.Objects;

public class Autocar {
	
	
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	private int numPlazas;
	
	//constructor vacío:
	
	public Autocar() {
		this.matricula ="";
		this.marca="";
		this.modelo="";
		this.km=0;
		this.numPlazas=0;
	}
	//constructor con datos
		
	public Autocar(String matricula, String marca, String modelo, int km, int numPlazas) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.numPlazas = numPlazas;
	}
	//getter y setter

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	
	
	// metodo equals y hashCode
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autocar other = (Autocar) obj;
		return Objects.equals(matricula, other.matricula);
	}
	//método toString

	@Override
	public String toString() {
		return "Autocar" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km
				+ ", numPlazas=" + numPlazas;
	}
	
	
	
}
