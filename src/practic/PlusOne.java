package practic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1,2,3};
        System.out.println(plusOne.plusOne(digits));
    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i]!=9) {
                digits[i] = digits[i] +1;
                return digits;
            }
            else	{
                digits[i]=0;
            }
        }
        int[] digitArr =new int[digits.length+1];
        digitArr[0]=1;
        return digitArr;
    }
}
