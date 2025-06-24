public class factorial {


    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fnm1=fact(n-1);
        return n*fnm1;
    }

    public static void main(String[] args){
        int n=5;
        System.out.println(fact(n));
    }
    
}
