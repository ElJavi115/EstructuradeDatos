public class IntString {

    public static void main(String[] args) {

        String r= convertirInt(146);
        System.out.println(r);
    }
    
    public static String convertirInt(int n){
        if(n==0){
            return "0";
        }
        if(n<10){
            return ""+(n%10);
        }
        return ""+convertirInt((n/10))+(n%10);
    }
}
