
public class ABB 
{
	private Nodo raiz;

	public ABB(Nodo raiz)
	{
		this.raiz = raiz;
	}
	
	public Nodo getRaiz() 
	{
		return raiz;
	}

	public void setRaiz(Nodo raiz) 
	{
		this.raiz = raiz;
	}
	
	public void agregar(int dato)
	{
		agregar(new Nodo(dato));
	}
	
	public void agregar(Nodo n)
	{
		if(raiz == null)
		{
			raiz = n;
		}
		else
		{
			agregar(n,raiz);
		}
	}
	
	private void agregar(Nodo n, Nodo actual)
	{
		if(actual.getDato() > n.getDato())
		{
			if(actual.getIzquierdo()!=null)
			{
				agregar(n, actual.getIzquierdo());
			}
			else
			{
				 actual.setIzquierdo(n);
			}
		}
		else
		{
			if(actual.getDerecho()!=null)
			{
				agregar(n, actual.getDerecho());
			}
			else
			{
				actual.setDerecho(n);
			}
		}
		
	}
	

	public Nodo nodoReemplazo(Nodo nodoR)
	{
		Nodo rPadre = nodoR;
		Nodo reemplazo = nodoR;
		Nodo aux = nodoR.getDerecho();
		
		while(aux!=null)
		{
			rPadre = reemplazo;
			reemplazo = aux;
			aux = aux.getIzquierdo();
		}
		if(reemplazo!=nodoR.getDerecho())
		{
			rPadre.setIzquierdo(reemplazo.getDerecho());
			reemplazo.setDerecho(nodoR.getDerecho());
		}
		
		return reemplazo;
	}
	
	//Metodo Eliminar
	public boolean eliminarNodo(int dato)
	{
		Nodo aux = raiz;
		Nodo padre = raiz;
		boolean hijoIzq = true;
		
		while(aux.getDato()!=dato)
		{
			padre = aux;
			if(dato<aux.getDato())
			{
				hijoIzq = true;
				aux = aux.getIzquierdo();
			}
			else
			{
				hijoIzq = false;
				aux = aux.getDerecho();
			}
			if(aux == null)
			{
				return false;
			}
		} 

		if(aux.getIzquierdo()==null && aux.getDerecho()==null)
		{
			if(aux==raiz)
			{
				raiz = null;
			}
			else if(hijoIzq)
			{
				padre.setIzquierdo(null);
			}
			else
			{
				padre.setDerecho(null);
			}
				
		}
		else if(aux.getDerecho()==null)
		{
			if(aux==raiz)
			{
				raiz = aux.getIzquierdo();
			}
			else if(hijoIzq)
			{
				padre.setIzquierdo(aux.getIzquierdo());
			}
			else
			{
				padre.setDerecho(aux.getIzquierdo());
			}
				
		}
		else if(aux.getIzquierdo()==null)
		{
			if(aux==raiz)
			{
				raiz = aux.getDerecho();
			}
			else if(hijoIzq)
			{
				padre.setIzquierdo(aux.getDerecho());
			}
			else
			{
				padre.setDerecho(aux.getDerecho());
			}
		}
		else
		{
			Nodo reemplazar = nodoReemplazo(aux);
			
			if(aux==raiz)
			{
				raiz = reemplazar;
			}
			else if(hijoIzq)
			{
				padre.setIzquierdo(reemplazar);
			}
			else
			{
				padre.setDerecho(reemplazar);
			}
			reemplazar.setIzquierdo(aux.getIzquierdo()); 
		}
		return true;
	}
	
	
	
	public void imprimir()
	{
		imprimeArbol(raiz);
	}
	
	private void imprimeArbol(Nodo n)
	{
		if(n!=null)
		{
			System.out.println(n.getDato());
			imprimeArbol(n.getDerecho());
			imprimeArbol(n.getIzquierdo());
			
		}
	}
	
	public void buscar(int dato)
	{
		buscarNodo(dato);
	}
	
	private Nodo buscarNodo(int dato)
	{
		Nodo actual = raiz;
		while(actual!=null && actual.getDato()!=dato)
		{
			if(actual.getDato()>dato)
				actual = actual.getIzquierdo();
			else
				actual = actual.getDerecho();
		}
		return actual;
	}
	
	public void buscarRecursivo(int dato)
	{
		Nodo actual = raiz;
		buscarNodoRecursivo(dato,actual);
	}
	
	private Nodo buscarNodoRecursivo(int dato, Nodo actual)
	{
		while(actual!=null && actual.getDato()!=dato)
		{
			if(actual.getDato()>dato)
				return buscarNodoRecursivo(dato,actual.getIzquierdo());
			else
				return buscarNodoRecursivo(dato,actual.getDerecho());
		}
		System.out.println(actual.toString());
		return actual;
	}
	
}