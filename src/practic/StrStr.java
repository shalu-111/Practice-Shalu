package practic;

import java.util.Objects;

public class StrStr {

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr( "mississippi", "pi"));
    }


    public int strStrNew(String haystack, String needle) {
        if (Objects.equals(needle, "")){
        return 0;
    }
        if(Objects.equals(haystack, "")){
            return -1;
        }
        for(int i=0 ; i< (haystack.length()-needle.length()); i++){
                if(haystack.substring(i, (i + needle.length())).equals(needle)){
                    return i;
                }
        }
        return -1;

    }

    public int strStr(String haystack, String needle) {
        if (Objects.equals(needle, "")){
            return 0;
        }
        if(Objects.equals(haystack, "")){
            return -1;
        }
        for(int i=0 ; i< haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.length() >= needle.length() && (i + needle.length())<= haystack.length() && haystack.substring(i, (i + needle.length())).equals(needle)){
                    return i;
                }

            }
        }
        return -1;
    }
}
