package practic;

public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsertPosition.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {

      for(int i=0; i<nums.length; i++){
          if(nums[i]== target){
              return i;
          }else {
          if(target > nums[i] && i+1 < nums.length && target < nums [i+1]){
            return i+1;
          }
          else if(target > nums[i] && i+1 == nums.length){
                  return i+1;
              }
         else if(target < nums[i] && i != 0){
              return i-1;
          }
          }
        }
      return 0;
    }

}
