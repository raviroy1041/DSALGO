package array;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int a[] = { -2, -3,-9, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        maxSubArraySum(a, n);
    }

    static void maxSubArraySum(int [] a, int n){

        int max=Integer.MIN_VALUE;
        int current_sum=0;

        int start=0, end=0;

        int i=0,j=0;

        for(end=0;end<n;end++){

            current_sum+=a[end];

            if(max<current_sum){
                max=current_sum;
                i=start;
                j=end;
            //    start=end+1;
            }

            if(current_sum<0){
                current_sum=0;
                start=end+1;
            }

        }

        System.out.println(i+" "+j);

    }
}
