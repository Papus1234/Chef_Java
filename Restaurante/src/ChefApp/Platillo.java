package ChefApp;

public class Platillo {
	String nombre;
	Ingredientes ingredientes;
	String informacion_nutricional;
	int precio;
	int tiempo_de_preparaci�n;
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


	public int getTiempo_de_preparaci�n() {
		return tiempo_de_preparaci�n;
	}


	public void setTiempo_de_preparaci�n(int tiempo_de_preparaci�n) {
		this.tiempo_de_preparaci�n = tiempo_de_preparaci�n;
	}

	public Receta getReceta() {
		return receta;
	}


	public void setReceta(Receta receta) {
		this.receta = receta;
	}

}
