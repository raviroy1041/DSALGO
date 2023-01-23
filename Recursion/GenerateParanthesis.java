package String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public static void main (String [] args){

        int n=3;
        String str="";
        List<String> result=new ArrayList<>();
       List<String> list= printParenthesis(str, result,n,0,0);
       for(String s:list){
           System.out.println(s);
       }
    }

    private static List<String> printParenthesis(String str, List<String> result,int n, int open, int close) {


        if(str.length()==2*n){
            result.add(str);
            return result;
        }
        if(open<n){
            printParenthesis(str+"(",result,n,open+1,close);
        }
        if(close<open){
            printParenthesis(str+")",result,n,open,close+1);
        }

        return result;
    }


}
