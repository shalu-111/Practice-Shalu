package practic;

public class MaximumSubarray {
    public static void main(String[] args) {
     MaximumSubarray maximumSubarray = new MaximumSubarray();
      int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
     int sum = 0;
     int max = nums[0];

     for(int i=0; i< nums.length; i++){
         if(sum < 0){
             sum = 0;
         }
         sum = sum +nums[i];
         if(sum >max){
             max = sum;
         }
     }

     return max;
    }


}
