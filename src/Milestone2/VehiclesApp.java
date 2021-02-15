package Milestone2;

import java.util.Scanner;

public class VehiclesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Cotxes arrayCotxes[] = new Cotxes[50];
		Motos arrayMotos[] = new Motos[50];
		Camions arrayCamions[] = new Camions[50];
		int CotxeActual = 0;
		int MotoActual = 0;
		int CamioActual = 0;
		String matricula = "", marca = "", color = "";
		String af = "";
		String af2 = "";

		System.out.println("Dades del titular");
		System.out.println("Nombre del titular: ");
		String nombre = scn.next();
		System.out.println("Apellido del titular: ");
		String apellido = scn.next();
		System.out.println("Nacimiento del titular: ");
		String nacimiento = scn.next();
		System.out.println("Licencia:(0)Sense licencia, (1)SoloMoto, (2)CotxeMoto, (3)Totes");
		int lic = scn.nextInt();
		switch (lic) {
		case 1:
			af = "SoloMoto";
			af2 = "Moto";
			break;
		case 2:
			af = "Cotxe y moto";
			af2 = "Cotxe";
			break;
		case 3:
			af = "Todos los vehiculos";
			af2 = "Camion";
			break;
		case 4:
			af = "Sin licencia";
			af2 = "";
			break;
		default:
			break;
		}

		System.out.println("Data caducitat:");
		String dataCad = scn.next();
		Licencia l1 = new Licencia(lic, af2, af, dataCad);

		System.out.println("Tiene seguro? (true)si (false)no");
		boolean seg = scn.nextBoolean();
		System.out.println("Teiene garaje? (true)si (false)no");
		boolean gar = scn.nextBoolean();

		Titular titu = new Titular(nombre, apellido, nacimiento, lic, seg, gar);

		System.out.println("MENU PRINCIPAL");
		System.out.println("(1)Cotxe nou (2)Moto nova (3)Camio nou (4)Sortir");
		int opcio = scn.nextInt();

		while (opcio != 4) {
			switch (opcio) {
			case 0:
				System.out.println("MENU PRINCIPAL");
				System.out.println("(1)Cotxe nou (2)Moto nova (3)Sortir");
				opcio = scn.nextInt();
				break;
			case 1:
				// si no llega a la licencia de cotxe no le deja
				if (l1.getId() < 2) {
					System.out.println("Licencia insuficiente");
				} else {
					System.out.println("Matricula del cotxe: ");
					matricula = scn.next();
					while (!CompMatr(matricula)) {
						System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
						matricula = scn.next();
					}
					System.out.println("Marca del cotxe: ");
					marca = scn.next();
					System.out.println("Color del cotxe: ");
					color = scn.next();

					arrayCotxes[CotxeActual] = new Cotxes(matricula, marca, color);
					arrayCotxes[CotxeActual].marcaRodes();

					conductor("cotxe");

					CotxeActual++;

				}
				opcio = 0;
				break;
			case 2:
				if (l1.getId() < 1) {
					System.out.println("Licencia insuficiente");
				} else {

					System.out.println("Matricula de la moto: ");
					matricula = scn.next();
					while (!CompMatr(matricula)) {
						System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
						matricula = scn.next();
					}
					System.out.println("Marca de la moto: ");
					marca = scn.next();
					System.out.println("Color de la moto: ");
					color = scn.next();

					arrayMotos[MotoActual] = new Motos(matricula, marca, color);
					arrayMotos[MotoActual].marcaRodes();
					MotoActual++;
					conductor("moto");

				}
				opcio = 0;

				break;
			case 3:
				if (l1.getId() < 3) {
					System.out.println("Licencia insuficiente");
				} else {

					System.out.println("Matricula del camió: ");
					matricula = scn.next();
					while (!CompMatr(matricula)) {
						System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
						matricula = scn.next();
					}
					System.out.println("Marca del camió: ");
					marca = scn.next();
					System.out.println("Color del camió: ");
					color = scn.next();

					arrayCamions[CamioActual] = new Camions(matricula, marca, color);
					arrayCamions[CamioActual].marcaRodes();
					CamioActual++;
					conductor("camio");

				}
				opcio = 0;
				break;
			case 4:
				System.out.println("ADEU!");
				break;

			default:
				System.out.println("Numero incorrecte torna a probar");
				opcio = 0;
				break;
			}
		}

//		for (Cotxes cotxes : arrayCotxes) {
//			System.out.println(cotxes.toString());
//		}

	}

	public static void conductor(String vehicle) {
		Scanner scn = new Scanner(System.in);
		String mensajeFinal = "";
		int licencia = 0;
		System.out.println("El Titular es el conductor del vehiculo? (1)si, (2)no");
		int con = scn.nextInt();
		if (con == 2) {
			System.out.println("Nom del conductor: ");
			String nom = scn.next();
			System.out.println("Cognom del conductor: ");
			String cognom = scn.next();
			System.out.println("Data de naixement del conductor: ");
			String DataNaix = scn.next();

			System.out.println("Licencia:(0)Sense licencia, (1)SoloMoto, (2)CotxeMoto, (3)Totes");
			licencia = scn.nextInt();
			Persona pers = new Persona(nom, cognom, DataNaix, licencia);
			// cotxe
			if (vehicle.equals("cotxe")) {
				if (licencia > 1) {
					mensajeFinal = "La persona inscrita no puede conducir el vehiculo";
				} else {
					mensajeFinal = "La persona inscrita puede conducir el vehiculo";
				}
			}
			// moto
		} else if (vehicle.equals("moto")) {
			if (licencia > 0) {
				mensajeFinal = "La persona inscrita no puede conducir el vehiculo";
			} else {
				mensajeFinal = "La persona inscrita puede conducir el vehiculo";
			}
			// camio
		} else if (vehicle.equals("camio")) {
			if (licencia > 2) {
				mensajeFinal = "La persona inscrita no puede conducir el vehiculo";
			} else {
				mensajeFinal = "La persona inscrita puede conducir el vehiculo";
			}

		}
	}

	public static boolean CompMatr(String matricula) {
		boolean ok = false;
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			ok = true;
		}

		return ok;
	}

}