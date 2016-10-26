package Estructuras_Basicas;

public class Lista<T>{
	   
    //Atributos
    private Ingrediente<T> primero;

    /**
     * Constructor por defecto
     */
    public Lista(){
        listaVacia();
    }

    private void listaVacia(){
        primero = null;
    }


    public boolean estaVacia(){
        return primero == null;
    }

    public void insertar(T t){
        Ingrediente<T> nuevo = new Ingrediente<T>(t);

        if (!estaVacia()){
            nuevo.setSiguiente(primero);
        }
        
        //el primero apunta al nodo nuevo
        primero=nuevo;
        
    }
    
    public int cuantosElementos(){
        Ingrediente<T> aux;
        int numElementos=0;
        aux = primero;

        //Recorremos
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;

    }
    
    public T devolverDato(int pos){
    	Ingrediente<T> aux=primero;
        int cont=0;
        T dato=null;
        
        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //recorremos
            while(aux!=null){
                if (pos == cont){
                    //Cogemos el dato
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                cont++;  
            }
        }
        return dato;
    }
    
    public void borraPosicion(int pos){

    	Ingrediente<T> aux=primero;
    	Ingrediente<T> anterior=null;
        int contador=0;

        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        primero = primero.getSiguiente();
                    }else {
                        //Actualizamos el anterior
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
    }
    
    public void mostrar(){
        System.out.println("Contenido de la lista");
        System.out.println("---------------------");
        
        Ingrediente<T> aux=primero;
        
        while(aux!=null){
            System.out.println(aux.getDato());//mostramos el dato
            aux=aux.getSiguiente();
        }
        
    }
}
