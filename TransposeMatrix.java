public class TransposeMatrix {

    public static void transpose(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int Transpose[][]=new int[col][row];  //oposite to matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                 Transpose[j][i]=matrix[i][j];

            }
        }

        //print transpose matrix
        for(int i=0;i<Transpose.length;i++){ 
          for( int j=0;j<Transpose[0].length;j++){
            System.out.print(Transpose[i][j]+" ");
          }
          System.out.println();
        }
    }

    public static void main(String [] args){
        int matrix[][]={{1,2,3},
        {4,5,6}};
        transpose(matrix);
    }
    
}
