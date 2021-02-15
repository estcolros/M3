package Milestone1;

import java.util.Scanner;

public class VehiclesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Cotxes arrayCotxes[] = new Cotxes[50];
		Motos arrayMotos[] = new Motos[50];
		int CotxeActual = 0;

		System.out.println("MENU PRINCIPAL");
		System.out.println("(1)Cotxe nou (2)Moto nova (3)Sortir");
		int opcio = scn.nextInt();

		while (opcio != 3) {
			switch (opcio) {
			case 0:
				System.out.println("MENU PRINCIPAL");
				System.out.println("(1)Cotxe nou (2)Moto nova (3)Sortir");
				opcio = scn.nextInt();
				break;
			case 1:
				System.out.println("Matricula del cotxe: ");
				String matricula = scn.next();
				while (!CompMatr(matricula)) {
					System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
					matricula = scn.next();
				}
				System.out.println("Marca del cotxe: ");
				String marca = scn.next();
				System.out.println("Color del cotxe: ");
				String color = scn.next();

				arrayCotxes[CotxeActual] = new Cotxes(matricula, marca, color);
				arrayCotxes[CotxeActual].marcaRodes();

				opcio = 0;
				break;
			case 2:
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

				arrayMotos[CotxeActual] = new Motos(matricula, marca, color);
				arrayMotos[CotxeActual].marcaRodes();

				opcio = 0;

				break;
			case 3:
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

	public static boolean CompMatr(String matricula) {
		boolean ok = false;
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			ok = true;
		}

		return ok;
	}

}