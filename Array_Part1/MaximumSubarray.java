public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int bag = 0;
        int sum = Integer.MIN_VALUE;
        for(int i:nums){
            bag +=i;
            if(bag>sum){
                sum=bag;
                }
            if(bag<0){
                bag = 0;
                }
            }
        System.out.println(sum);
    }
}
