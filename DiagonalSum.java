public class DiagonalSum {

    public static void diagonalSum(int arr[][]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=arr[i][i];    //for primary diagonal i and j indices are same (0,0),(1,1),(2,2),(3,3)

            //for seccondary diagonal (0,3),(1,2),(2,1),(3,0)
            if(i!=n-1-i){
            sum+=arr[i][n-1-i];
        }
        }
        System.out.print(sum);
        
    }

    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},};
                    diagonalSum(arr);
    }
    
}
