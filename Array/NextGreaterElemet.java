package array;

import java.util.*;

public class NextGreaterElemet {

    public static void main(String [] args){
        int arr[]= {4,5,2,25,26,4,8,2};
        int n = arr.length;

        printNGE(arr, n);
    }

    public static void printNGE(int[] arr, int n) {

    Stack<Integer> s=new Stack<>();
    s.push(arr[0]);
//    int [] nge= new int[n];
    for(int i=1;i<n;i++){
        int next=arr[i];



        if(!s.isEmpty()){
        int curr=s.pop();

        while(next>curr){
            System.out.println("next greater of "+curr +"is "+next);
            if(s.isEmpty())
            break;
            curr=s.pop();

        }

        if(next<curr)
            s.push(curr);

        }
        s.push(next);
    }

    while(!s.isEmpty()){
        System.out.println("next greater of "+s.pop() +"is -1");
    }
    }
}


