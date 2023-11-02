public class SmallestElement{
    public static void main(String[] args) {
        int nums[] = {-10,1,5,6,-11};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}