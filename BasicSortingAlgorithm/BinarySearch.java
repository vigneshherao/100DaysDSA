package BasicSortingAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        for(int i = 0; i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i :nums){
            System.out.println(i);
        }
    }
}
