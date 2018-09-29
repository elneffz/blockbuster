package blockbuster;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Tienda t = new Tienda();
		int id;
		int alta;
		int baja;
		
		int opcion = 0;
		do {
			System.out.println("Menu Blockbuster\n");
		if (t.actualUsuario != null) {
				System.out.println("Usuario " + t.actualUsuario.conseguirNickname());
		}
			System.out.println("1.- Ver Catalogo");
			System.out.println("2.- Regresar");
			System.out.println("3.- Ver Prestado");
			System.out.println("4.- Dar De Alta");
			System.out.println("5.- Dar de baja");
			System.out.println("6.- Manejo de Usuario");
			System.out.print(">> ");
			
			sc.reset();
			switch (opcion = sc.nextInt()){
			
			/*Ver catalogo*/
				case 1:
					t.menuVerCatalogo();
					break;
				
				/*Regresar*/	
				case 2:
					
					System.out.println("1.- Pelicula");
					System.out.println("2.- Serie");
					System.out.println("3.- Salir");
					
					switch (sc.nextInt()) {
					case 1:
						System.out.println("ID> ");
						id = sc.nextInt();
						Pelicula p = t.peliculas.get(id);
							if(p != null)
							{
								p.regresar();
								System.out.println("Regresando...");
							}
						
						break;
					case 2:
						System.out.println("ID> ");
						id = sc.nextInt();
						Serie s = t.series.get(id);
							if(s.id == id)
							{
								s.regresar();
								System.out.println("Regresando...");
							}
					default:
						break;
					}
					
					/*Ver Prestado*/
				case 3:
					
					for (Serie s:t.series.values()) {
						if(s.prestado)
							System.out.println(s.conseguirInfo());
					}
					for (Pelicula p:t.peliculas.values()) {
						if(p.prestado)
							System.out.println(p.conseguirInfo());
					}
					break;
					
					
				/*Dar de alta*/	
				case 4:
					System.out.println("Dar de Alta ");
					System.out.println("1.-Pelicula");
					System.out.println("2.-Serie");
					switch(alta = sc.nextInt()) {
					case 1:
						t.darAltaPelicula();
						break;
					case 2:
						t.darAltaSerie();
					default:
						break;
					}
					break;
				/*Dar de baja*/
				case 5: 
					System.out.println("Dar de Baja ");
					System.out.println("1.-Pelicula");
					System.out.println("2.-Serie");
					System.out.println("3.-Salir");
					switch(baja = sc.nextInt()) {
					case 1:
						t.darBajaPelicula();
						break;
					case 2:
						t.darBajaSerie();
					default:
						break;
					}
					break;
				case 6:
					System.out.println("Dar de Alta Usuario ");
					System.out.println("1.-Pedir Datos");
					System.out.println("2.-Mostrar Usuarios");
					System.out.println("3.-Escoger Usuario");
					System.out.println("4.-Salir");
					switch(baja = sc.nextInt()) {
					case 1:
						t.darAltaUsuario();
						break;
					case 2:
						t.verUsuario();
					case 3:
						t.buscarUsuario();
					default:
						break;
					}
				default:
					break;
			}
		} while(opcion !=7);
		sc.close();
	}
}
