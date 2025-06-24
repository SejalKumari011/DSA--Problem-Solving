public class FirstOccurence {

    public static int firstOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    }

    public static void main(String [] args){
        int arr[]={3,6,12,10,34};
        int key=10;
        System.out.println(firstOccur(arr, key, 0));
    }
    
}
