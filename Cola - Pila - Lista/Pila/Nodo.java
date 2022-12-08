

public class Nodo {
	private Object dato;
	private Nodo nodoSiguiente;

	
	public Nodo (Object dato){
		this.setDato(dato);
	}

	public Nodo getSiguiente() {
		return nodoSiguiente;
	}

	public void setSiguiente(Nodo nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}
	
}
