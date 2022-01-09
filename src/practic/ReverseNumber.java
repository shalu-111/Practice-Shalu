package practic;

public class ReverseNumber {


    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(1534236469));
    }

    public int reverse(int x) {
        int reverse = 0;
        while(x!=0){
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10){
                return 0;
            }
            int reminder = x%10;
            reverse = reverse*10+reminder;
            x= x/10;
        }
        return reverse;
    }
}
