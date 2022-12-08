import java.util.Scanner;

public class Camiones {
	
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int cajas = 0, cap = 0;
		System.out.print("Cajas: ");
		cajas = sc.nextInt();
		System.out.print("Capacidad: ");
		cap = sc.nextInt();
		sc.close();
		System.out.println("Cantidad de camiones: "+trasportarCajas(cajas, cap,0));
	}

	public static int trasportarCajas(int cajas, int cap, int camiones){
		if(cajas>0 && cajas<=cap)
		{
			return camiones+1;
		}
		if(cajas>cap)
		{
			cajas -= cap;
			return trasportarCajas(cajas,cap,camiones+1);
		}
		return camiones;
	}
}