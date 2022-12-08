import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(new Integer(15));
		lista.add(25);
		//lista.add("30");
		
		int cantidad = lista.size();
		
		for(int x = 0; x < cantidad; x++)
		{
			System.out.println(lista.get(x));
		}
		System.out.println("---------------");
		for (Object object : lista) 
		{
			System.out.println(object);
		}
		System.out.println("---------------");
		LinkedList<Integer> listaLigada = new LinkedList<Integer>();
		listaLigada.add(new Integer(15));
		listaLigada.add(25);
		//listaLigada.add("30");
		for (Object object : listaLigada) {
			System.out.println(object);
		}
    }
}
