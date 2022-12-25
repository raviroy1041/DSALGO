package array;

public class TrappingRainwater {
    public static void main(String[] args)
    {
        int [] arr={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Maximum water that can be accumulated is " + findWater(arr));
    }

    private static int findWater(int []arr) {

        int water=0;
        int n=arr.length;
        int [] left=new int[n];
        int [] right=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            right[j]=Math.max(right[j+1],arr[j]);
        }

        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-arr[i];
        }
        return water;
    }
}
