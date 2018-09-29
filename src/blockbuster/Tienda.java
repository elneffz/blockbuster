package blockbuster;
import java.util.Hashtable;
import java.util.Scanner;


public class Tienda {
	

	
	Hashtable<Integer, Serie> series;
	Hashtable<Integer, Pelicula> peliculas;
	Hashtable<Integer, Usuario> usuarios;
	Usuario actualUsuario;
	
	Tienda(){
		series = new Hashtable<Integer, Serie>();
		peliculas = new Hashtable<Integer, Pelicula>();
		usuarios = new Hashtable<Integer, Usuario>();
		actualUsuario = null;
	}

	
	
	
	
	/*Submenu Peliculas*/
	
	void subMenuPeliculas(){
		Scanner sc = new Scanner (System.in);
		int id;
		boolean encontrado = false;
		
		for(Pelicula p:peliculas.values())
			System.out.println(p.conseguirInfo());
		
		System.out.println("Peliculas\n");
		System.out.println("1.1.1- Pedir Prestado");
		System.out.println("1.2.2 Salir");
		System.out.println(">> ");
		
		switch(sc.nextInt()) {
		case 1:
			System.out.println("ID> ");
			id = sc.nextInt();
			Pelicula p = peliculas.get(id);
				if(p != null) {
					p.prestar();
					encontrado = true;
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
		
		
		for(Serie s:series.values())
			System.out.println(s.conseguirInfo());
		
		System.out.println("Series\n");
		System.out.println("1.2.1- Pedir Prestado");
		System.out.println("1.2.2 Salir");
		System.out.println(">> ");
		
		switch(sc.nextInt()) {
		case 1:
			System.out.print("ID> ");
			id = sc.nextInt();
			Serie s = series.get(id);
			if(s != null) {
					actualUsuario.pedirSerie(s);
					encontrado = true;
					break;
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
	
	
	
	
	/*SubMenu Dar De alta Serie*/
	
	void darAltaSerie() {
		Scanner sc = new Scanner(System.in);
		
		int id;
		String titulo;
		String creador;
		int temps;
		
		System.out.println("ID> ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Titulo> ");
		titulo = sc.nextLine();
		
		System.out.print("Temporadas> ");
		temps = sc.nextInt();
		sc.nextLine();
		System.out.print("Creador> ");
		creador = sc.nextLine();
		sc.nextLine();
		
		Serie s = new Serie(id, titulo,creador,temps);
		
		this.series.put(id, s);
		
		}
	
	
	/*SubMenu Dar De alta Pelicula*/
	
	void darAltaPelicula() {
		Scanner sc = new Scanner(System.in);
		int id;
		int anio;
		String productor;
		String genero;
		String titulo;
		
		System.out.println("ID> ");
		id = sc.nextInt();
		System.out.println("Anio> ");
		anio = sc.nextInt();
		sc.nextLine();
		System.out.println("Productor> ");
		productor = sc.nextLine();
		System.out.println("Genero> ");
		genero = sc.nextLine();
		System.out.println("Titulo> ");
		titulo = sc.nextLine();
		
		Pelicula p = new Pelicula(id, anio, titulo, productor, genero);
		
		this.peliculas.put(id, p);
		
		}
	
	void darBajaPelicula() {
		Scanner sc = new Scanner(System.in);
		int id;
		
	System.out.println("ID>");
	id = sc.nextInt();
	
	Pelicula s = peliculas.get (id);
	if(s != null) {
		this.peliculas.remove(id, s);
	}	
		
	else {
		System.out.println("La pelicula " + sc.nextInt() + "no existe");
	}
	}
	
	
	/*SubMenu Dar De baja Serie*/
	
	void darBajaSerie() {
		Scanner sc = new Scanner(System.in);
		int id;
		
	System.out.println("ID>");
	id = sc.nextInt();
	
	Serie s = series.get (id);
	if(s != null) {
		this.series.remove(id, s);
	}	
		
	else {
		System.out.println("La serie " + sc.nextInt() + "no existe");
	}
	}
	
	void darAltaUsuario() {
		Scanner sc = new Scanner(System.in);
		int id;
		String nickname;
		String nombre;
		String contrasenia;
		
		System.out.println("ID> ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nickname> ");
		nickname = sc.nextLine();
		sc.nextLine();
		System.out.println("Nombre> ");
		nombre = sc.nextLine();
		System.out.println("Contrasenia> ");
		contrasenia = sc.nextLine();
		
		Usuario u = new Usuario(id, nickname, nombre, contrasenia);
		
		this.usuarios.put(id, u);
		
		}
	void verUsuario() {
		Scanner sc = new Scanner (System.in);
		for(Usuario u:usuarios.values())
			System.out.println(u.conseguirUsuario());
		
	}
	
	void buscarUsuario(){
		int id;
		Scanner sc = new Scanner (System.in);
		for(Usuario u:usuarios.values())
			System.out.println(u.conseguirUsuario());
		
		System.out.println("Introduzca ID \n");
		System.out.println(">>");
		id = sc.nextInt();
		
		actualUsuario = usuarios.get(id);
		
	}
	
}
	