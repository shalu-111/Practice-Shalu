package practic;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String s = " Hello World ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
     char[] stringArr = s.trim().toCharArray();
     for(int i= stringArr.length-1 ; i>0; i--){
         if(stringArr[i] == ' '){
             return  stringArr.length-1 - i;
         }
     }
     return stringArr.length;
    }
}
