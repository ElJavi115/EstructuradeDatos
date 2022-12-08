

public class Main 
{

	public static void main(String[] args) 
	{
		ABB arbol = new ABB(new Nodo(9));
		
		Nodo n1 = new Nodo(10);
		Nodo n2 = new Nodo(4);
		Nodo n3 = new Nodo(22);
		Nodo n4 = new Nodo(11);
		Nodo n5 = new Nodo(90);
		Nodo n6 = new Nodo(41);
		Nodo n7 = new Nodo(77);
		Nodo n8 = new Nodo(20);
		Nodo n9 = new Nodo(30);
		
		
		arbol.agregar(n1);
		arbol.agregar(n2);
		arbol.agregar(n3);
		arbol.agregar(n4);
		arbol.agregar(n5);
		arbol.agregar(n6);
		arbol.agregar(n7);
		arbol.agregar(n8);
		arbol.agregar(n9);
		
		
		arbol.imprimir();
		System.out.println();
		arbol.eliminarNodo(4);
		arbol.imprimir();
	}

}