package ChefApp;

public class Prueba {

	public static void main(String[] args) {
		Ingredientes c=new Ingredientes();
		c.Registrar("chorizo", "carnes");
		c.Registrar("pierna de pollo", "carnes");
		c.Registrar("manzana", "frutas");
		c.Registrar("papaya", "frutas");
		c.Registrar("manzana", "frutas");
		c.ordenar();
		//System.out.println(c.frutas.mostrar());
		// TODO Auto-generated method stub
		System.out.println("Frutas:");
		for(int i=0; i<c.frutas.cuantosElementos();i++ ){
			System.out.println(c.frutas.devolverDato(i).getNombre());
			
		}
		
		System.out.println("Carnes:");
		for(int i=0; i<c.carnes.cuantosElementos();i++ ){
			System.out.println(c.carnes.devolverDato(i).getNombre());
			
		}
		
		System.out.println("Lácteos:");
		for(int i=0; i<c.lacteos.cuantosElementos();i++ ){
			System.out.println(c.lacteos.devolverDato(i).getNombre());
			
		}
		
		System.out.println("Vegetales:");
		for(int i=0; i<c.vegetales.cuantosElementos();i++ ){
			System.out.println(c.vegetales.devolverDato(i).getNombre());
			
		}
		
		System.out.println("Granos:");
		for(int i=0; i<c.granos.cuantosElementos();i++ ){
			System.out.println(c.granos.devolverDato(i).getNombre());
			
		}
	}

}
