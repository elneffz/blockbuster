package blockbuster;
import java.util.ArrayList;
import java.util.Scanner;


public class Tienda {
	
	ArrayList<Serie> series;
	ArrayList<Pelicula> peliculas;
	
	Tienda(){
		series = new ArrayList<Serie>();
		series.add(new Serie(1,"Breaking Bad", "Vince Gilligan"));
		series.add(new Serie(2, "The Simpson", "Matt Groenning"));
		series.add(new Serie(3, "Vikings", "Michael Hirst"));
		
		peliculas = new ArrayList<Pelicula>();
		peliculas.add(new Pelicula(1, 1996,"Toy Story","Bonnie Arnold", "Comedia"));
		peliculas.add(new Pelicula(2, 2017,"IT","Andrés Muschietti", "Terror"));
		peliculas.add(new Pelicula(3, 1996,"ET The Extra","Steven Spielberg", "Drama"));
	}
	
	
	
	
	
	/*Submenu Peliculas*/
	void subMenuPeliculas(){
		Scanner sc = new Scanner (System.in);
		int id;
		boolean encontrado = false;
		
		for(Pelicula p:peliculas)
			System.out.println(p.conseguirInfo());
		
		System.out.println("Peliculas\n");
		System.out.println("1.1.1- Pedir Prestado");
		System.out.println("1.2.2 Salir");
		System.out.println(">> ");
		
		switch(sc.nextInt()) {
		case 1:
			System.out.println("ID> ");
			id = sc.nextInt();
			for (Pelicula p:peliculas) {
				if(p.id==id) {
					p.prestar();
					encontrado = true;
					break;
				}
			}
			break;
		case 2:
			System.out.println("Saliendo...");
		default:
			break;
		}
		
	}
	
	/*Submenu Series*/
	void subMenuSeries(){
		Scanner sc = new Scanner (System.in);
		int id;
		boolean encontrado = false;
		
		
		for(Serie s:series)
			System.out.println(s.conseguirInfo());
		
		System.out.println("Series\n");
		System.out.println("1.2.1- Pedir Prestado");
		System.out.println("1.2.2 Salir");
		System.out.println(">> ");
		
		switch(sc.nextInt()) {
		case 1:
			System.out.print("ID> ");
			id = sc.nextInt();
			for(Serie s:series) {
				if(s.id==id) {
					s.prestar();
					encontrado = true;
					break;
				}
			}
			
			break;
		case 2:
			System.out.println("Saliendo...");
		default:
			break;
		}
		
	}
	
	
	/*Catalogo*/
	void menuVerCatalogo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.1- Peliculas");
		System.out.println("1.2- Series");
		System.out.print(">> ");
		
		switch(sc.nextInt()) {
		case 1:
			this.subMenuPeliculas();
			break;
		case 2:
			this.subMenuSeries();
			break;
		default:
			break;
		}
	}
	
	
	void menuRegresarPeliculaSerie() {
		
		
	}
	
}