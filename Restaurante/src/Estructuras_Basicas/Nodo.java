package Estructuras_Basicas;

public class Nodo {
		public Nodo next;
		public String data;
		
		
		public Nodo(String data)
		{
			this.data=data;
		}
		public String getData()
		{
			return this.data;
		}
		
		public void setNext(Nodo pointer)
		{
			this.next = pointer;
		}
}
