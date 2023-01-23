package array;

public class subArrayWithGivenSum {

    public static void main(String [] args){
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }

    static void subArraySum(int [] arr, int n, int sum){
        int i=0,j=0;
        int s=arr[i];

        for(j=1;j<=n;j++){
            while(s>sum && i<j-1){
                s-=arr[i];
                i=i+1;

            }
            if(sum==s){
               System.out.println(i+" "+(j-1));
            }
            if(j<n)
            s+=arr[j];


        }
    }

}
