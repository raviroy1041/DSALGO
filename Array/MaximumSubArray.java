package array;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArray {

    public static void main(String [] args){
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int [] arr1={5,4,-1,7,8};
        System.out.print(maxSubArraySum(arr1,arr1.length));
    }

    private static int maxSubArraySum(int[] arr, int n) {

        int max=arr[0],currentsum=arr[0];


        for(int i=1;i<n;i++){
            currentsum+=arr[i];
            if(max<currentsum)
                max=currentsum;
            if(currentsum<0)
                currentsum=0;
        }

        return max;
    }
}
