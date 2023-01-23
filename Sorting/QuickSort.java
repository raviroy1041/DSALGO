package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSortAlgo(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSortAlgo(int[] arr, int low, int high) {

        if(low<high){
            int p=partition(arr,low,high);
            quickSortAlgo(arr,low,p-1);
            quickSortAlgo(arr,p+1,high);
        }

    }
    public static int partition(int []arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);
        return i+1;

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
