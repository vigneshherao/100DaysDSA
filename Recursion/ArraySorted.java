package Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int arr[] = {8,1,3,8};
        int i = 0;
        System.out.println(Check(arr, i));
    }

    public static boolean Check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return Check(arr, i+1);
    }
}
