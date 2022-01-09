package practic;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.getRomanToInteger("MCMXCIV"));
    }

    int getRomanToInteger(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("IV", 5);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        char[] charArray = s.toCharArray();
        int num = 0;
        for (int i = 0; i < charArray.length; i++) {
            if ((i+1) < charArray.length && romanMap.get(Character.toString(charArray[i])) < romanMap.get(Character.toString(charArray[i+1]))) {
                num = num - romanMap.get(Character.toString(charArray[i]));
            } else {
                num = num + romanMap.get(Character.toString(charArray[i]));
            }
        }
        return num;
    }
}
