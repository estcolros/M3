package Milestone3;

public class Licencia {
	protected int id;
	protected String tipusLicencia;
	protected String nomComplert;
	protected String dataCaducitat;

	public Licencia(int id, String tipusLicencia, String nomComplert, String dataCaducitat) {
		this.id = id;
		this.tipusLicencia = tipusLicencia;
		this.nomComplert = nomComplert;
		this.dataCaducitat = dataCaducitat;
	}

	public int getId() {
		return id;
	}

	public String getTipusLicencia() {
		return tipusLicencia;
	}

	public String getNomComplert() {
		return nomComplert;
	}

	public String getDataCaducitat() {
		return dataCaducitat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTipusLicencia(String tipusLicencia) {
		this.tipusLicencia = tipusLicencia;
	}

	public void setNomComplert(String nomComplert) {
		this.nomComplert = nomComplert;
	}

	public void setDataCaducitat(String dataCaducitat) {
		this.dataCaducitat = dataCaducitat;
	}

}