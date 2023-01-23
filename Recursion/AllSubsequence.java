package String;

import java.util.HashSet;
import java.util.Set;

public class AllSubsequence {

    public static void main(String [] args){
        String s="abcb";
        Set<String> set=new HashSet<>();
        printAllSubsequence(s,0,"",set);
    }

    private static void printAllSubsequence(String s, int i, String s1,Set<String>set) {

        if(i>=s.length()){
            if(!set.contains(s1)){
                set.add(s1);
                System.out.println(s1);
            }

            return;
        }
        printAllSubsequence(s,i+1,s1+s.charAt(i),set);
        printAllSubsequence(s,i+1,s1,set);


    }
}
