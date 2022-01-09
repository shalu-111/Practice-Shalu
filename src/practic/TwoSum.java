package practic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum()));
    }

    public int[] twoSum() {
        int[] numbers = {2,7,11};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

      for(int i=0; i<numbers.length; i++){
       map.put(numbers[i], i);
      }
        for(int i=0; i<numbers.length; i++){
            int num = target - numbers[i];
            if(map.get(num) != null &&  map.get(num) != i){
                return new int[] {i,map.get(num)};
            }
        }
        return null;
    }

}
