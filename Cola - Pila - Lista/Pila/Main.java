

public class Main {

	public static void main(String[] args) {
		Nodo  n1 = new Nodo("a");
		Nodo n2 = new Nodo("b");
		Nodo n3 = new Nodo("c");
		
		Pila p = new Pila();
		p.agregar(n1);
		p.agregar(n2);
		p.agregar(n3);
		p.mostrar();
		p.eliminar();
		p.mostrar();
		

	}

}
