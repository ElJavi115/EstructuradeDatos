public class MenorDigito {
    
    public static void main(String[] args) {
        int n=2538479;
        int lon = (int) Math.log10(n);
        int menor = digitoMenor(n, 10,0,lon);
        System.out.println(menor);
    }
    
    public static int digitoMenor(int n,int menor, int c, int lon){
        if(c<=lon){
            if(menor>n%10){
                menor = n%10;
            }
            return digitoMenor(n/10, menor, c+1,lon);
        }
            return menor;
    }
}
