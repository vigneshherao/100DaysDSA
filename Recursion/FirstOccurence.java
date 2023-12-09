package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {8,1,3,8};
        int i = 0;
        System.out.println(Check(arr, i));
    }

    public static int Check(int arr[],int i){
        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==8){
            return i;
        }
        return Check(arr, i+1);
    }
}




