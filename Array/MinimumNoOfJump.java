package array;

public class minNoOfJump {
    public static void main(String args[])
    {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;
        System.out.print(
                "Minimum number of jumps to reach end is "
                        + minJumps(arr));
    }

    private static int minJumps(int[] arr) {

        int n=arr.length;
        int [] jump=new int[n];
        jump[0]=0;

        for(int i=1;i<n;i++){
            jump[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(i<=(j+arr[j])){
                    jump[i]=Math.min(jump[i],jump[j]+1);
        //            System.out.println("ravi"+jump[i]);
                }
            }
        }
        return jump[n-1];

       }



}
