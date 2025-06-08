public class SpiralMatrix {

    public static void spiralMatrix(int arr[][]){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;

        //top
       while(startRow<=endRow && startCol<=endCol){ 
        
        for(int j=startCol;j<=endCol;j++){
            System.out.print(arr[startRow][j]+" ");
        }

        //right

        for(int i=startRow+1;i<=endRow;i++){
             if(startCol==endCol){
                break;
            }  
            System.out.print(arr[i][endCol]+" ");
        }

        //bottom

        for(int j=endCol-1;j>=startCol;j--){
             if(startCol==endCol){
                break;
            }
           
            System.out.print(arr[endRow][j]+" ");
        }

        //left

        for(int i=endRow-1;i>=startRow+1;i--){
             if(startCol==endCol){
                break;
            }
            System.out.print(arr[i][startCol]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
        

    }
    System.out.println();
}

    public static void main(String [] args){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiralMatrix(arr);

    }
    
}
