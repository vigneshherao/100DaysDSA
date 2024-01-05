public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,3,-2};
        int start = 0;
        int end = arr.length - 1;

        Sort(arr,start,end);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void Sort(int arr[],int start,int end){
        if(start>=end){
            return;
        }

        int index = Partition(arr,start,end);
        Sort(arr, start, index-1);
        Sort(arr, index+1,end);
    }


    public static int Partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i = start-1;

        for(int j = start; j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
}
