package practic;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        TwoSum2 twoSum = new TwoSum2();
        System.out.println(Arrays.toString(twoSum.twoSum()));
    }
    public int[] twoSum() {
        int[] numbers = {-1,0}; int target = -1;
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum < target){
                left++;
            }else if (sum > target) {
                 right--;
            }else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return null;
    }

}
