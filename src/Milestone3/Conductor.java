package Milestone3;

public class Conductor extends Persona{

	public Conductor(String nom, String cognom, String dataNaixement, int licencia) {
		super(nom, cognom, dataNaixement, licencia);

	}

	@Override
	public String toString() {
		return "Conductor [nom=" + nom + ", cognom=" + cognom + ", dataNaixement=" + dataNaixement + ", licencia="
				+ licencia + "]";
	}



}