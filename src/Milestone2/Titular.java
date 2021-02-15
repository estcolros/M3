package Milestone2;

public class Titular extends Persona {
	protected boolean segur;
	protected boolean garatge;

	public Titular(String nom, String cognom, String dataNaixement, int licencia, boolean segur, boolean garatge) {
		super(nom, cognom, dataNaixement, licencia);
		this.segur = segur;
		this.garatge = garatge;
	}

	public boolean isSegur() {
		return segur;
	}

	public boolean isGaratge() {
		return garatge;
	}

	public void setSegur(boolean segur) {
		this.segur = segur;
	}

	public void setGaratge(boolean garatge) {
		this.garatge = garatge;
	}

}