public class PrimeNumber {

    public static boolean printPrime(int n){
        boolean isPrime=true;
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }  
        }
        return isPrime;
    }
    public static void main(String[] args){
        System.out.println(printPrime(11));

    } 
}
