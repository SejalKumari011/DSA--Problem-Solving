public class SumInRow {
    //calculate sum of digit in 2nd row

    public static int sumInRow(int arr[][]){
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        return sum;
    }

    public static void main(String[] args){
        int arr[][]={{1,4,9},
        {5,7,8},
        {5,10,15},
        };
        System.out.println(sumInRow(arr));

    }
    
}
