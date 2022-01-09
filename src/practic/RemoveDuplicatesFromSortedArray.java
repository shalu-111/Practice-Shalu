package practic;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
      int count= 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[ count ++] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        return count;
    }
}
