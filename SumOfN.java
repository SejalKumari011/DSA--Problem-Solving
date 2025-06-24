public class SumOfN {

    public static int sumOfNNatural(int n){
        if(n==0){
            return 0;
        }

        int fnm1=sumOfNNatural(n-1);
        return n+fnm1;
    }

    public static void main(String [] args){
        int n=1;
        System.out.println(sumOfNNatural(n));
    }
    
}
