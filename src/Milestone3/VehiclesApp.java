package Milestone3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VehiclesApp {

	static ArrayList<Cotxes> cotxes = new ArrayList<Cotxes>();
	static ArrayList<Conductor> conductors = new ArrayList<Conductor>();
	static ArrayList<Motos> motos = new ArrayList<Motos>();
	static ArrayList<Camions> camiones = new ArrayList<Camions>();
	static ArrayList<Titular> titulars = new ArrayList<Titular>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String matricula = "", marca = "", color = "";

		int primOpcio = 0;
		while (primOpcio != 3) {
			switch (primOpcio) {
			case 0:
				System.out.println("MENU PRINCIPAL");
				System.out.println("(1)Menu vehicle (2)Menu persones (3)Sortir");
				primOpcio = scn.nextInt();
				break;
			case 1:
				System.out.println("MENU VEHICLES");
				System.out.println(
						"(1)Crear cotxe \n(2)Crear moto \n(3)Crear camió \n(4)Mostrar cotxes \n(5)Mostrar motos \n(6)Mostrar camions \n(7)Salir");
				int opcioVehicle = scn.nextInt();
				switch (opcioVehicle) {
				case 1:
					Titular titu = newTitular();
					// Si tiene al menos la de coche
					if (titu.getLicencia() > 1) {
						System.out.println("Matricula del vehiculo: ");
						matricula = scn.next();
						while (!CompMatr(matricula)) {
							System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
							matricula = scn.next();
						}
						System.out.println("Marca del vehicle: ");
						marca = scn.next();
						System.out.println("Color del vehicle: ");
						color = scn.next();
						System.out.println("Quieres añadir conductores?(1)Si (2)No");
						int cond = scn.nextInt();
						if (cond == 1) {
							System.out.println("Cuantos conductores vas a añadir?");
							int numcond = scn.nextInt();

							ArrayList<Conductor> conduc = new ArrayList<>();
							for (int i = 0; i < numcond; i++) {
								Conductor conductor = conductor();
								if (conductor.getLicencia() > 1) {
									conductors.add(conductor);
									conduc.add(conductor);

								} else {
									System.out.println("Licencia mal");
								}

							}
						}
						Cotxes c = new Cotxes(matricula, marca, color);
						titulars.add(titu);
						cotxes.add(c);
					} else {
						System.out.println("No puedes conducir este tipo de vehiculo");
					}

					break;
				case 2:
					titu = newTitular();
					// Si tiene al menos la de moto
					if (titu.getLicencia() > 0) {
						System.out.println("Matricula del vehiculo: ");
						matricula = scn.next();
						while (!CompMatr(matricula)) {
							System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
							matricula = scn.next();
						}
						System.out.println("Marca del vehicle: ");
						marca = scn.next();
						System.out.println("Color del vehicle: ");
						color = scn.next();

						System.out.println("Quieres añadir conductores?(1)Si (2)No");
						int cond = scn.nextInt();
						if (cond == 1) {
							System.out.println("Cuantos conductores vas a añadir?");
							int numcond = scn.nextInt();

							ArrayList<Conductor> conduc = new ArrayList<>();
							for (int i = 0; i < numcond; i++) {
								Conductor conductor = conductor();
								if (conductor.getLicencia() > 0) {
									conductors.add(conductor);
									conduc.add(conductor);

								} else {
									System.out.println("Licencia mal");
								}

							}
						}
						Motos c = new Motos(matricula, marca, color);
						titulars.add(titu);
						motos.add(c);
					} else {
						System.out.println("No puedes conducir este tipo de vehiculo");
					}

					break;
				case 3:
					titu = newTitular();
					// Si tiene al menos la de camio
					if (titu.getLicencia() > 2) {
						System.out.println("Matricula del vehiculo: ");
						matricula = scn.next();
						while (!CompMatr(matricula)) {
							System.out.println("La matricula ha de ser de 4 digits y 3 letres mayuscules");
							matricula = scn.next();
						}
						System.out.println("Marca del vehicle: ");
						marca = scn.next();
						System.out.println("Color del vehicle: ");
						color = scn.next();

						System.out.println("Quieres añadir conductores?(1)Si (2)No");
						int cond = scn.nextInt();
						if (cond == 1) {
							System.out.println("Cuantos conductores vas a añadir?");
							int numcond = scn.nextInt();

							ArrayList<Conductor> conduc = new ArrayList<>();
							for (int i = 0; i < numcond; i++) {
								Conductor conductor = conductor();
								if (conductor.getLicencia() > 2) {
									conductors.add(conductor);
									conduc.add(conductor);

								} else {
									System.out.println("Licencia mal");
								}

							}
						}
						Camions c = new Camions(matricula, marca, color);
						titulars.add(titu);
						camiones.add(c);
					} else {
						System.out.println("No puedes conducir este tipo de vehiculo");
					}

					break;
				case 4:// mostrar cotxe
					for (int ç = 0; ç < cotxes.size(); ç++) {
						System.out.println(cotxes.get(ç).toString());
					}
					break;
				case 5:
					for (int ç = 0; ç < motos.size(); ç++) {
						System.out.println(motos.get(ç).toString());
					}
					break;
				case 6:
					for (int ç = 0; ç < camiones.size(); ç++) {
						System.out.println(camiones.get(ç).toString());
					}
					break;
				case 7:
					System.out.println("Adios");
					primOpcio = 0;
					break;
				default:
					break;
				}
				break;
			case 2:

				int opcioPersona = 0;
				while (opcioPersona != 3) {
					switch (opcioPersona) {
					case 0:
						System.out.println("MENU PERSONES");
						System.out.println("(1)Listar Conductores (2)Listar Titular (3)Salir");
						opcioPersona = scn.nextInt();
						break;
					case 1:
						for (int ç = 0; ç < conductors.size(); ç++) {
							System.out.println(conductors.get(ç).toString());
						}
						opcioPersona = 0;
						break;
					case 2:
						for (int ç = 0; ç < titulars.size(); ç++) {
							System.out.println(titulars.get(ç).toString());
						}
						opcioPersona = 0;
						break;
					case 3:
						System.out.println("Adeu!");
						primOpcio = 0;

						break;

					default:
						break;
					}
				}
				primOpcio = 0;
				break;
			case 3:
				System.out.println("FIN");
				break;
			}
		}
	}

	public static Conductor conductor() {
		Scanner scn = new Scanner(System.in);
		String af = "";
		String af2 = "";
		System.out.println("Nom del conductor: ");
		String nom = scn.next();
		System.out.println("Cognom del conductor: ");
		String cognom = scn.next();
		System.out.println("Data de naixement del conductor: ");
		String DataNaix = scn.next();

		System.out.println("Licencia:(0)Sense licencia, (1)SoloMoto, (2)CotxeMoto, (3)Totes");
		int licencia = scn.nextInt();

		switch (licencia) {
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
		System.out.println("Data caducitat llicencia: ");
		String lic = scn.next();
		Licencia a = new Licencia(licencia, af2, af, lic);
		Conductor condu = new Conductor(nom, cognom, DataNaix, licencia);
		return condu;

	}

	public static boolean CompMatr(String matricula) {
		boolean ok = false;
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			ok = true;
		}

		return ok;
	}

	public static void CrearPersona(int posicion, Persona a) {
		Scanner scn = new Scanner(System.in);

		String af = "";
		String af2 = "";

		System.out.println("Dades de la persona");
		System.out.println("Nombre de la persona: ");
		String nombre = scn.next();
		System.out.println("Apellido de la persona: ");
		String apellido = scn.next();
		System.out.println("Nacimiento de la persona: ");
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

	}

	static Titular newTitular() {
		Scanner scn = new Scanner(System.in);
		String af = "";
		String af2 = "";

		System.out.println("Nombre de la titular: ");
		String nombre = scn.next();
		System.out.println("Apellido de la titular: ");
		String apellido = scn.next();
		System.out.println("Nacimiento de la titular: ");
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
		Titular a = new Titular(nombre, apellido, nacimiento, lic, seg, gar);
		return a;

	}

}