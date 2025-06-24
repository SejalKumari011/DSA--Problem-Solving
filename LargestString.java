public class LargestString {


    public static String largestString(String str[]){

        String largest= str[0];

        for(int i=0;i<str.length;i++){
            if(str[i].compareTo(largest)>0){
                largest=str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        String[] str={"apple","mango","banana"};

        System.out.println(largestString(str));

    }
    
}
