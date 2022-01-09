package practic;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums =  {-1,0,1,2,-1,-4};
        System.out.println(threeSum.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 0 || (nums.length == 1 && nums[0] == 0)){
            return result;
        }
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                     left++;
                  //  right--;
                }
            }
        }
        Set<List<Integer>> set = new LinkedHashSet<>();
        result.stream().forEach(a ->set.add(a)
                );
        result.clear();
        result.addAll(set);
        return result;
    }
}
