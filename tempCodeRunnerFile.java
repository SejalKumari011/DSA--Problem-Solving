public class SumOfN {

    public static int sumOfNNatural(int n){
        if(n==1){
            return 1;
        }

        int fnm1=sumOfNNatural(n-1);
        return n+fnm1;
    }

    public static void main(String [] args){
        int n=5;
        System.out.println(sumOfNNatural(n));
    }
    
}
