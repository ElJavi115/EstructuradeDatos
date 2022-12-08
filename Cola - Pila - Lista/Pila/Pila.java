
public class Pila  implements IPila{
	private Nodo inicio;
	private Nodo fin;

	
	
	@Override
	public boolean agregar(Nodo n) {
			if(fin!=null){
				fin.setSiguiente(n);
				fin = fin.getSiguiente();
			}
			else{
				inicio = n;
				fin = n;
			}
			return true;
	}
	
	@Override
	public void eliminar() {
		Nodo actual = new Nodo(null);
		if(inicio!= null){
			if(actual == inicio){
			}
		}
	}
	@Override
	public void mostrar() {
		Nodo nodo = inicio;
		int contador=0;
		while(nodo!= null){
			System.out.println("Nodo "+ ++contador);
			System.out.println(nodo.getDato());
			nodo = nodo.getSiguiente();
		}
		
	}
	
	
	
}
