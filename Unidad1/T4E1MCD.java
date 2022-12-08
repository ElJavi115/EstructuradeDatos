

public class MCD {
    
    public static void main(String[] args) {
        System.out.println(maximoComun(12, 8));
    }

    public static int maximoComun(int n1, int n2){
        if(n2 > 0){
            return maximoComun(n2, n1%n2);
        }
        return n1;
    }
}
