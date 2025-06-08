public class Searching {

    public static void Search(int arr[][],int row, int col,int key){
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.print("Key found at: "+row+","+col);
                return;
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("Key not found. ");
    }

    public static void main(String[] args){
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
                     Search(arr,0,arr[0].length-1,33 );
    }
   
    
}
