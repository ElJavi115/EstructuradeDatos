public class BinarioaDecimal {
    
    public static void main(String[] args) {
        System.out.println(convertirBinario(1011, 0,0));
    }
    
    public static int convertirBinario(int num, int i, int d){
        
        if(num>0){
            return convertirBinario(num/10, i+1,d+=num%10 * (int)Math.pow(2, i));
        }
        
        return d;
        
        

    }
}
