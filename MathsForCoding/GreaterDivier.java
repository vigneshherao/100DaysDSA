public class GreaterDivier {
    public static void main(String[] args) {
        int smallNumber = Integer.MAX_VALUE;
        int nums[] = {2,5,6,9,10};
        int largeNumber = Integer.MIN_VALUE;
        int count = 0;
        int greated = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]<smallNumber){
                smallNumber = nums[i];
            }
            if(nums[i]>largeNumber){
                largeNumber = nums[i];
            }
        }
        for(int i = 1; i<=largeNumber;i++){
            if(smallNumber % i == 0 && largeNumber % i == 0){
                count = i;
                greated = count;
            }
        }
       System.out.println(greated);
    }
}
