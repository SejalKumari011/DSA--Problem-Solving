import java.util.*;
public class StringPalindrome {


    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

    }

    public static void main(String [] args){
        //String str="racecar";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        System.out.println(isPalindrome(str));
    }
    
}
