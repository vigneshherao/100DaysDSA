public class MergeSOrt {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,3 };
        int start = 0;
        int end = arr.length - 1;

        Divide(arr, start, end);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        Divide(arr, start, mid);
        Divide(arr, mid + 1, end);

        Conquer(arr, start, mid, end);
    }

    public static void Conquer(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1; 
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[start + m] = temp[m];
        }
    }
}
