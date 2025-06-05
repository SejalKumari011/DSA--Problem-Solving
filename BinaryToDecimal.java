public class BinaryToDecimal {

    public static int binToDec(int n){
        int pow=0;
        int dec=0;
        
        while(n>0){
            int lastDigit=n%10;
            dec+=lastDigit*Math.pow(2,pow);
            pow++;
            n/=10;
        }
        return dec;
    }
    public static void main(String[] args){
        int n=101;
        System.out.println(binToDec(n));
    }
    
}
