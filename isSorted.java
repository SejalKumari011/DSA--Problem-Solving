public class isSorted {

    public static boolean IsSorted(int arr[],int i){
            if(i==arr.length-1){
                return true;
            }

            if(arr[i]>arr[i+1]){
                return false;
            }

            return IsSorted(arr,i+1);         
    }

    public static void main(String [] args){

        int arr[]={1,2,10,4,5};
        System.out.println(IsSorted(arr, 0));

    }
    
}
