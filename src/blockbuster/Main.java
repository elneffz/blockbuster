package blockbuster;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Tienda t = new Tienda();
		int id;
		
		int opcion = 0;
		do {
			System.out.println("Menu Blockbuster\n");
			System.out.println("1.- Ver Catalogo");
			System.out.println("2.- Regresar");
			System.out.println("3.- Ver Prestado");
			System.out.println("4.- Salir");
			System.out.print(">> ");
			
			sc.reset();
			switch (opcion = sc.nextInt()){
				case 1:
					t.menuVerCatalogo();
					break;
				case 2:
					
					System.out.println("1.- Pelicula");
					System.out.println("2.- Serie");
					System.out.println("3.- Salir");
					
					switch (sc.nextInt()) {
					case 1:
						System.out.println("ID> ");
						id = sc.nextInt();
						for (Pelicula p:t.peliculas) {
							if(p.id == id)
							{
								p.regresar();
								System.out.println("Regresando...");
							}
						}
						
						break;
					case 2:
						System.out.println("ID> ");
						id = sc.nextInt();
						for (Serie s:t.series) {
							if(s.id == id)
							{
								s.regresar();
								System.out.println("Regresando...");
							}
						}
					default:
						break;
					}
					//break;
				case 3:
					
					for (Serie s:t.series) {
						if(s.prestado)
							System.out.println(s.conseguirInfo());
					}
					for (Pelicula p:t.peliculas) {
						if(p.prestado)
							System.out.println(p.conseguirInfo());
					}
					break;
				default:
					break;
			}
		} while(opcion !=4);
		sc.close();
	}
}
