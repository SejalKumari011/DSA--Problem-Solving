public class FibbonacciSeries {


    public static int fibSeries(int n){

        if(n<=1){
            return n;
        }

        int fnm1=fibSeries(n-1);
        int fnm2=fibSeries(n-2);
        return fnm1+fnm2;
    }

    public static void main(String [] args){
        int n=10;
        for(int i=0;i<+n;i++){
            System.out.print(fibSeries(i)+" ");
        }
    }
    
}
