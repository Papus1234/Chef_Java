package Estructuras_Basicas;

public class Ingrediente<T> {
  
   private T dato;
   private Ingrediente<T> siguiente;

   /**
    * Constructor por defecto
    */
   public Ingrediente(){
       siguiente=null;
    }


   public Ingrediente(T p){
       siguiente=null;
       dato = p;
   }

   public Ingrediente(T t, Ingrediente<T> siguiente){
       this.siguiente=siguiente;
       dato = t;
   }
   
   public T getDato() {
       return dato;
   }

   public void setDato(T dato) {
       this.dato = dato;
   }

   public Ingrediente<T> getSiguiente() {
       return siguiente;
   }

   public void setSiguiente(Ingrediente<T> siguiente) {
       this.siguiente = siguiente;
   }
   
}