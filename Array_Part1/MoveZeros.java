public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                 int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
            }
        }
        //after swapping zero to the right side 

        for(Integer n :nums){
            System.out.println(n);
        }
    }
}
