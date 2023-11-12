package TwoDArrays;

public class SecondRowSum {
    public static void main(String[] args) {
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
        int k = 1;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[k][i];
        }
        System.out.println(sum);
    }
}
