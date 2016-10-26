package Estructuras_Basicas;

public class List 
{
	Nodo head;
	int lenght = 0;
	
	public List()
	{
		
	}
	public void insert(String object)
	{
		if(lenght==0)
		{
			head= new Nodo(object);
			lenght++;
		}else
		{
			Nodo temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.setNext(new Nodo(object));
			lenght++;
		}
	}
	public Nodo getPosition(int position)
	{
		int count = 0;
		Nodo temp;
		temp = head;
		while(count!=position)
		{
			temp = temp.next;
			count++;
		}
		return temp;
	}
	public void mostrar(List lista){
		int contador=0;
		String lista1="[";
		while (contador!=lista.lenght){
			if (contador==0){
				lista1=lista1+head.data;
			}
			else{
				lista1=lista1+","+head.data;
			}
			head=head.next;
			contador++;
		}
		 System.out.print(lista1+"]");
	}
}
