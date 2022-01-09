package practic;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-101));
    }
    public boolean isPalindrome(int x) {
    int reverse = 0;
       int n =x;
       if(x< 0){
           return false;
       }
        while(n!=0){
        int reminder = n%10;
        reverse = reverse*10+reminder;
            n= n/10;
    }
        return reverse == x;
}
}
