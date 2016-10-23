package ChefApp;

import Estructuras_Basicas.List;

public class Ingredientes {
	List frutas,vegetales,granos,lacteos,carnes;

	
	
	public Ingredientes(){
		frutas=new List();
		granos=new List();
		vegetales=new List();
		lacteos=new List();
		carnes=new List();
	}
	
	public void Registrar(String ingrediente, String categoria){
		if (categoria=="frutas"){
			frutas.insert(ingrediente);
		}
		else if(categoria=="granos"){
			granos.insert(ingrediente);
		}
		else if(categoria=="vegetales"){
			vegetales.insert(ingrediente);
	    }
		else if(categoria=="lacteos"){
			lacteos.insert(ingrediente);
	    }
		else if(categoria=="carnes"){
			carnes.insert(ingrediente);
	    }
		else{
			System.err.print("Categoría no válida");
		}
	}	
}
