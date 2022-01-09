package practic;

import java.math.BigInteger;

public class PowerDigitSum {

    public static void main(String[] args) {
        PowerDigitSum powerDigitSum = new PowerDigitSum();
        //powerDigitSum.getPowerDigitSum();
        powerDigitSum.getThreesPow(89);
    }


    void getPowerDigitSum(){
          BigInteger pow = new BigInteger("2").pow(1000);
          System.out.println(pow);
          String sum1 = pow.toString();
          System.out.println(sum1);
         char[] num = sum1.toCharArray();
         BigInteger sumDigits = BigInteger.ZERO;
         for(int i =0 ; i<num.length; i++){
          sumDigits = sumDigits.add(new BigInteger(Character.toString(num[i])));
        }
        System.out.println(sumDigits);
    }
    void getThreesPow(int n){
        Integer mod = n%4;

        System.out.println("last digit is ="+ (new Double(Math.pow(3,mod)).intValue())%10);


        for(int i=0; i<=1000; i++) {
            BigInteger pow = new BigInteger("3").pow(i);
             System.out.println("for "+ i +" = "+pow);

        }
    }
}
