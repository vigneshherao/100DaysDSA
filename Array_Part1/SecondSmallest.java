public class SecondSmallest {
    public static void main(String[] args) {
        int nums[] = {1,2,1,4,6};
        int minValue = Integer.MAX_VALUE;
		int secondMinValue = Integer.MAX_VALUE;

		for(int i = 0; i<nums.length;i++){
			if(nums[i]<minValue){
				secondMinValue = minValue;
				minValue = nums[i];
			}
		    else if(nums[i]<secondMinValue && nums[i]!=minValue){
                secondMinValue = nums[i];
			}
		}

        System.out.println(secondMinValue);
    }
}
