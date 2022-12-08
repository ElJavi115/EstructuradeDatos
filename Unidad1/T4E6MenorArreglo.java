public class MenorArreglo {
    
    public static void main(String[] args) {
        int[] arreglo={1,2,3,4,5,6};
        int menor = 99999999;
        int r = digitoMenor(arreglo, 0, menor);
        System.out.println(r);
    }

    public static int digitoMenor(int[] arreglo, int i, int menor){
        if(menor>arreglo[i]){
            menor = arreglo[i];
        }

        if(i+1<arreglo.length){
            return (digitoMenor(arreglo, i+1, menor));
        }
        
        return menor;
    }
}
