package ChefApp;

public class Platillo {
	String nombre;
	Ingredientes ingredientes;
	String informacion_nutricional;
	int precio;
	int tiempo_de_preparación;
	Receta receta;
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Ingredientes getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
	}


	public String getInformacion_nutricional() {
		return informacion_nutricional;
	}


	public void setInformacion_nutricional(String informacion_nutricional) {
		this.informacion_nutricional = informacion_nutricional;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getTiempo_de_preparación() {
		return tiempo_de_preparación;
	}


	public void setTiempo_de_preparación(int tiempo_de_preparación) {
		this.tiempo_de_preparación = tiempo_de_preparación;
	}

	public Receta getReceta() {
		return receta;
	}


	public void setReceta(Receta receta) {
		this.receta = receta;
	}

}
