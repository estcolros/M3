package Milestone2;

public class Vehicle {
	protected int rodes;

	public boolean comprobarDiametre(double diametre) {
		boolean ok = false;
		if (diametre <= 4.0 && diametre >= 0.4) {
			ok = true;
		}
		return ok;
	}
}