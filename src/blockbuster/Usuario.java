package blockbuster;

import java.util.Hashtable;
import java.util.Scanner;

public class Usuario {
	
/* Atributos */
	
	private int id;
	private String nickname;
	private String nombre;
	private String contrasenia;
	private Hashtable<Integer, Serie> series;
	private Hashtable<Integer, Pelicula> peliculas;
	
/* Constructores */
	
	Usuario(int id, String nickname, String nombre, String contrasenia){
		
	this.id = id;
	this.nickname = nickname;
	this.nombre = nombre;
	this.contrasenia = contrasenia;
	
	series = new Hashtable<Integer, Serie>();
	peliculas = new Hashtable<Integer, Pelicula>();
	}
	
		
	String conseguirUsuario() {
		StringBuilder st = new StringBuilder();
		st.append("ID: " + this.id + " ");
		st.append("Nickname: " + this.nickname + " ");
		st.append("Nombre: " + this.nombre + " ");
		st.append("Contrasenia: " + this.contrasenia + " ");
		return st.toString();
		}
	
/* Metodos set */
	
public void asignarNombre(String nombre) {
	this.nombre = nombre;
}
public void asignarContrasenia(String contrasenia) {
	this.nombre = nombre;
}
	
	
/* Metodos get */
public int conseguirID() {
	return this.id;
}
public String conseguirNickname() {
	return this.nickname;
}
public String conseguirNombre() {
	return this.nombre;
}	
	
public void pedirSerie(Serie s) {
 if(!s.prestado) {
	 s.prestar();
	 series.put(s.id, s);
 }
 else {
	 System.out.println("La serie " + s.conseguirInfo() + "esta prestada");
 }
}

public void regresarSerie(Serie s) {
	if (s.prestado) {
		Serie yoLatengo = series.get(s.conseguirInfo());
		if (yoLatengo != null) {
			s.regresar();
			series.remove(s.conseguirInfo());
			
		}
		else {
			 System.out.println("El usuario " + this.nickname + "no la tiene prestada");
		}
		
	}
	else {
	System.out.println("La serie " + s.conseguirInfo() + "no esta prestada");
		
	}
}
	
public void pedirPelicula(Pelicula p) {
	 if(!p.prestado) {
		 p.prestar();
		 peliculas.put(p.id, p);
	 }
	 else {
		 System.out.println("La Pelicula " + p.conseguirInfo() + "esta prestada");
	 }
	}

	public void regresarPelicula(Pelicula p) {
		if (p.prestado) {
			Pelicula yoLatengo = peliculas.get(p.conseguirInfo());
			if (yoLatengo != null) {
				p.regresar();
				peliculas.remove(p.conseguirInfo());
				
			}
			else {
				 System.out.println("El usuario " + this.nickname + "no la tiene prestada");
			}
			
		}
		else {
		System.out.println("La pelicula " + p.conseguirInfo() + "no esta prestada");
			
		}
	}
		


}
