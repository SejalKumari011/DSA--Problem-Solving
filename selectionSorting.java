public class selectionSorting {

    public static void selection(int arr[]){

        for(int i=0;i<arr.length;i++){
             int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if (arr[j]<arr[minPos]){
                minPos=j;
            }
            
        } 
        //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
    }
    public static void main(String[] args){
        int arr[]={5,9,4,3,1,0};
        selection(arr);
        printArray(arr);
    }
    
}

    

