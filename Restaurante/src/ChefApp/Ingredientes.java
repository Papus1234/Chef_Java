package ChefApp;

import Estructuras_Basicas.Lista;

public class Ingredientes {
	Lista<String> frutas,vegetales,granos,lacteos,carnes;

	
	
	public Ingredientes(){
		frutas=new Lista<String>();
		granos=new Lista<String>();
		vegetales=new Lista<String>();
		lacteos=new Lista<String>();
		carnes=new Lista<String>();
	}
	
	public void Registrar(String ingrediente, String categoria){
		if (categoria=="frutas"){
			frutas.insertar(ingrediente);
		}
		else if(categoria=="granos"){
			granos.insertar(ingrediente);
		}
		else if(categoria=="vegetales"){
			vegetales.insertar(ingrediente);
	    }
		else if(categoria=="lacteos"){
			lacteos.insertar(ingrediente);
	    }
		else if(categoria=="carnes"){
			carnes.insertar(ingrediente);
	    }
		else{
			System.err.print("Categoría no válida");
		}
	}	
}
