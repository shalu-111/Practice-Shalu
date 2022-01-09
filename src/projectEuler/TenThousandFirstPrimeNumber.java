package projectEuler;

import static java.lang.Math.sqrt;

public class TenThousandFirstPrimeNumber {


    public static void main(String[] args) {
        TenThousandFirstPrimeNumber tenThousandFirstPrimeNumber = new TenThousandFirstPrimeNumber();
        tenThousandFirstPrimeNumber.getTenThousandFirstPrimeNumber();
    }


  void getTenThousandFirstPrimeNumber(){
       boolean [] array = new boolean[2000000];
       array[0] = true;
       array[1] = true;
       int count = 0;
       for (int i =2;i <= sqrt(array.length)+1;i++)
       {
           if(!array[i]) {
               for (int j = i+i; j < array.length; j=j+i) {
                       array[j] = true;
               }
           }
       }
       long sum =0;
       for(int k=2; k<array.length;k++){
           if(!array[k]){
               sum = sum + k;

        /*
        count ++;
           if(count == 10001){
               System.out.println(k);
               return;
           }*/
       }
       }
      System.out.println(sum);
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            return n % i != 0;
        }
            return true;
        }

}
