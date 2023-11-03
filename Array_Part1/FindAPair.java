import java.util.ArrayList;
import java.util.Arrays;

public class FindAPair{
    public static void main(String[] args) {
        
        int arr[] = {2,9,1,5};

        int target = 10;


        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        ArrayList<Integer>  pairs = new ArrayList<>();
        while(start<=end){
            if(arr[start]+arr[end]==target){
                pairs.add(arr[start]);
                pairs.add(arr[end]);
                break;
            }
            else if(arr[start]+arr[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        for(Integer value :pairs){
            System.out.println(value);
        }

    }
}