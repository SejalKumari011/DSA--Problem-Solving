public class fibonacci {

    public static int fibOfN(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fnm1=fibOfN(n-1);
        int fnm2=fibOfN(n-2);
        return fnm1+fnm2;
    }


    public static void main(String[] args){
        int n=4;
        System.out.println(fibOfN(n));

    }
    
}
