public class ReverseArray {
    public static void main(String[] args) {

                int nums[] = {4,3,2,1};

                int start = 0;
                int end = nums.length-1;
                while(start<=end){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }


                //checking array after swapping

                for (int i : nums) {
                    System.out.println(i);
                }
                
    }
}
