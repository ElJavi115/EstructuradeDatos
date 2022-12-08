public class Ejercicio4 {

    public static void main(String[] args) {
        Ejercicio4 e = new Ejercicio4();
        int r = e.misterio(20);
        System.out.println(r);
    }

//Este metodo tranforma a binario el número que le ingreses
//Si ingresas 15 devuleve "1111"
//Si ingresas 20 devuelve "10100"

    int misterio(int n){
        if(n==1||n==0){
            return n;
        }
        else{
            return 10*misterio(n/2)+n%2;
        }
    }
    
}
