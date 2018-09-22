package blockbuster;

public class Pelicula {

	public int id;
	public int anio;
	public boolean prestado;
	public String productor;
	public String genero;
	public String titulo;
	
	Pelicula(int id, int anio, String titulo, String productor, String genero){
		this.id = id;
		this.anio = anio;
		this.genero = genero;
		this.prestado = false;
		this.productor = productor;
		this.titulo = titulo;
	}
	
	void prestar () {
		if(!prestado) {
			prestado = true;
			System.out.println("La Pelicula " + this.id + " fue prestada" );
		}
		else {
			System.out.println("La pelicula " + this.id + "no la tenemos");
		}
	}
	void regresar() {
		if(prestado) {
			prestado = false;
			System.out.println("La Pelicula " + this.id + " esta prestada" );
		}
		else {
			System.out.println("La pelicula " + this.id + "fue regresada");
		}
	}
	String conseguirInfo() {
		StringBuilder st = new StringBuilder();
		st.append("ID: " + this.id + " ");
		st.append("Anio: " + this.anio + " ");
		st.append("Titulo: " + this.titulo + " ");
		st.append("Productor: " + this.productor + " ");
		st.append("genero: " + this.genero + " ");
		return st.toString();
	}
}
