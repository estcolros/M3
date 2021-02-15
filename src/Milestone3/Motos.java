package Milestone3;
import java.util.Scanner;

import Milestone2.Vehicle;

public class Motos extends Vehicle {
	Scanner scn = new Scanner(System.in);
	protected final int RODES_DEF = 2;
	protected String matricula;
	protected String marca;
	protected String color;
	protected String marcaRodesDelanteres;
	protected String marcaRodesTraseres;
	protected double diamRodesDelanteres;
	protected double diamRodesTraseres;

	public Motos(String matricula, String marca, String color) {
		super();
		this.rodes = RODES_DEF;
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	public int getRODES_DEF() {
		return RODES_DEF;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public String getMarcaRodesDelanteres() {
		return marcaRodesDelanteres;
	}

	public String getMarcaRodesTraseres() {
		return marcaRodesTraseres;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarcaRodesDelanteres(String marcaRodesDelanteres) {
		this.marcaRodesDelanteres = marcaRodesDelanteres;
	}

	public void setMarcaRodesTraseres(String marcaRodesTraseres) {
		this.marcaRodesTraseres = marcaRodesTraseres;
	}

	public double getDiamRodesDelanteres() {
		return diamRodesDelanteres;
	}

	public double getDiamRodesTraseres() {
		return diamRodesTraseres;
	}

	public void setDiamRodesDelanteres(double diamRodesDelanteres) {
		this.diamRodesDelanteres = diamRodesDelanteres;
	}

	public void setDiamRodesTraseres(double diamRodesTraseres) {
		this.diamRodesTraseres = diamRodesTraseres;
	}

	@Override
	public String toString() {
		return "Motos [RODES_DEF=" + RODES_DEF + ", matricula=" + matricula + ", marca=" + marca + ", color=" + color
				+ ", marcaRodesDelanteres=" + marcaRodesDelanteres + ", marcaRodesTraseres=" + marcaRodesTraseres
				+ ", diamRodesDelanteres=" + diamRodesDelanteres + ", diamRodesTraseres=" + diamRodesTraseres + "]";
	}

	public void marcaRodes() {
		double diamRodesTras = 0.1;

		System.out.println("Marca de la roda delantera: ");
		String marcaRodesDel = scn.next();
		System.out.println("Diametre de la roda delantera: ");
		String aa = scn.next();
		Double DiamRodesDel = Double.parseDouble(aa);

		while (!comprobarDiametre(DiamRodesDel)) {
			System.out.println("El diametre ha de estar entre 0.4 i 4");
			aa = scn.next();
			DiamRodesDel = Double.parseDouble(aa);

		}

		System.out.println("Marca de la roda trasera: ");
		String marcaRodesTras = scn.next();
		System.out.println("Diametre de la roda trasera: ");
		aa = scn.next();
		diamRodesTras = Double.parseDouble(aa);
		while (!comprobarDiametre(diamRodesTras)) {
			System.out.println("El diametre ha de estar entre 0.4 i 4");
			aa = scn.next();
			diamRodesTras = Double.parseDouble(aa);

		}

		this.setMarcaRodesDelanteres(marcaRodesDel);
		this.setMarcaRodesTraseres(marcaRodesTras);
		this.setDiamRodesDelanteres(DiamRodesDel);
		this.setDiamRodesTraseres(diamRodesTras);

	}

}