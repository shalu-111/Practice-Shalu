package practic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        lcp.longestCommonPrefix(new String[]{"abhishek","cfhinav", "abram"});
    }

    public String findCommonString(String s1, String s2) {
        char[] chars = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length && i < chars2.length;i++) {
            if(chars[i]==chars2[i]) {
                sb.append(chars[i]);
            } else {
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
            return findCommonString(Arrays.asList(strs).stream().min(String::compareTo).get(), Arrays.asList(strs).stream().max(String::compareTo).get());
        }
//        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(strs));
//        while (linkedList.size() > 1) {
//            linkedList.addFirst(findCommonString(linkedList.removeFirst(), linkedList.removeFirst()));
//        }
//        return linkedList.removeFirst();
 //   }
}
