package projectEuler;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SpecialPythagoreanTriplet {


    public static void main(String[] args) {
        SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
        specialPythagoreanTriplet.getSpecialPythagoreanTriplet();
    }

    void getSpecialPythagoreanTriplet(){
        int[] numbers = new int[1000];
        Arrays.setAll(numbers, i -> i + 1);
        int target = 1000;
        for(int i =0; i< numbers.length; i++){
            int left = i+1;
            int right = numbers.length-1;
            while(left < right){
               long sum = numbers[i]+ numbers[left] + numbers[right];
               if(sum < target){
                   left ++;
               }else if(sum > target){
                   right --;
               }else {
                   double abSqr = Math.pow(numbers[i], 2) + Math.pow(numbers[left], 2);
                   double rightSqr = Math.pow(numbers[right],2);
                   if(abSqr == rightSqr){
                       System.out.println(numbers[i] + " " + numbers[left] + " " + numbers[right]);
                       System.out.println(numbers[i] * numbers[left] * numbers[right]);
                       return;
                   }
//                   left++;
                   right--;
               }
            }
        }
        System.out.println("***************");
    }

}
