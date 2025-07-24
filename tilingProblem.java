public class tilingProblem {

    public static int tiling(int n){
        //base case

        if(n==0 || n==1){
            return 1;
        }

        //recursion
        //vertical
        int fnm1=tiling(n-1);

        //horizontal
        int fnm2=
        tiling(n-2);

        //total ways
        int totWays=fnm1+fnm2;
        return totWays;
    }



    public static void main(String [] args){
        int n=2;
        System.out.println(tiling(n));
    }
    
}
