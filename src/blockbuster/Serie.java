package blockbuster;

public class Serie {

	public int id;
	public int temps;
	public boolean prestado;
	public String creador;
	public String titulo;
	
	Serie(int id, String titulo, String creador){
		this.id = id;
		this.temps = 5;
		this.prestado = false;
		this.creador = creador;
		this.titulo = titulo;
	}
	
	void prestar () {
		if(!prestado) {
			prestado = true;
			System.out.println("La Serie " + this.id + " ha sido prestada" );
		}
		else {
			System.out.println("La serie" + this.id + "no la tenemos");
		}
	}
	void regresar() {
		if(prestado) {
			prestado = false;
			System.out.println("La Serie " + this.id + " esta prestada" );
		}
		else {
			System.out.println("La Serie " + this.id + "Fue regresada");
		}
	}
	String conseguirInfo() {
		StringBuilder st = new StringBuilder();
		st.append("ID: " + this.id + " ");
		st.append("Titulo: " + this.titulo + " ");
		st.append("Creador: " + this.creador + " ");
		st.append("Numero de Temporadas: " + this.temps + " ");
		return st.toString();
	}
}
