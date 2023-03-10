package String;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {

    public static void main(String [] args){

        String digits="235";

        ArrayList<String> list=letterCombinations(digits);

        for(String s:list){
            System.out.print(s+" ");
        }

    }

    private static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> AL = new ArrayList<String>();
        if (digits.isEmpty()) {
            return AL;
        }
        LKC(digits, "", AL);
        return AL;
    }
    public static void LKC(String number, String path, ArrayList<String> AL) {
        if (number.isEmpty()) {
            AL.add(path);
            return;
        }
        char ch = number.charAt(0);
        String rem = number.substring(1);
        String options = getComb(ch);
        for (int i = 0; i < options.length(); i++) {
            LKC(rem, path + options.charAt(i), AL);
        }
    }
    public static String getComb(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else if (ch == '9') {
            return "wxyz";
        }
        return "";
    }
}
