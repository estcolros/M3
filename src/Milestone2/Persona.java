package Milestone2;

public class Persona {
	protected String nom;
	protected String cognom;
	protected String dataNaixement;
	protected int licencia;

	public Persona(String nom, String cognom, String dataNaixement, int licencia) {
		this.nom = nom;
		this.cognom = cognom;
		this.dataNaixement = dataNaixement;
		this.licencia = licencia;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public String getDataNaixement() {
		return dataNaixement;
	}

	public int getLicencia() {
		return licencia;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public void setLicencia(int licencia) {
		this.licencia = licencia;
	}

}