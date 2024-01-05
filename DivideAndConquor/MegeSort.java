public class MegeSort {
    public static void main(String[] args) {
        int arr[]  = {3,2,1};
        int start = 0;
        int end = arr.length-1;

     }
     public static void Divide(int arr[],int start, int end){
        if(start<=end){
            return;
        }

        int mid = (start+end) / 2;



        Divide(arr,start,mid);
        Divide(arr,mid+1,end);

        Merge(arr,start,mid,end);

     }

     public static void Merge(int arr[],int start,int mid,int end){
        int temp[] = new int[start + end];

        
     }



}
