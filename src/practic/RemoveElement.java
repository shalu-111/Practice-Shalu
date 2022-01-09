package practic;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement.removeElement(nums, val));
    }
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        int count= 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                int originalVal = nums[count];
                nums[count++] = nums[i];
                nums[i] = originalVal;

            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        return count;
    }
}
