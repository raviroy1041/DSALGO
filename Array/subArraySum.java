package array;

public class subArraySum {

    public static void main(String [] args){
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 24;
        subArray(arr, n, sum);
    }

    private static void subArray(int[] arr, int n, int sum) {

        int i=0,j=0;
        int arraysum=arr[0];
        for(j=1;j<n;j++){

            while(arraysum>sum){
                arraysum-=arr[i];
                i++;
            }
            if(arraysum==sum){
                System.out.print(i+" "+(j-1));
                break;
            }
            arraysum+=arr[j];
       //     System.out.println(arraysum);

        }
    }
}
