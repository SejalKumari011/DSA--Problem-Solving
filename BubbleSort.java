public class BubbleSort {

    public static void bubblesort(int arr[]){
        int n=arr.length;
        int largest[];

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }

    
}
