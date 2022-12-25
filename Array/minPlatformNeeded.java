package array;

import java.util.Arrays;

public class minPlatformNeeded {

    public static void main(String[] args)
    {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                + findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1;
        int i=1,j=0;
        int result=1;
        while(i<n && j<n){

            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }
            else if(arr[i]>dep[j]){
                platform--;
                j++;
            }
            if(result<platform){
                result=platform;
            }
        }
        return result;
    }
}
