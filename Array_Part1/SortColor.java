public class SortColor {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        int red = 0;
        int white = 0;
        int blue = 0;
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                red += 1;
            }
            else if(nums[i]==1){
                white += 1;
            }
            else{
                blue +=1;
            }
        }

        while(red!=0){
            nums[index] = 0;
            index++;
            red--;
        }
            while(blue!=0){
            nums[index] = 1;
            index++;
            blue--;
        }
            while(white!=0){
            nums[index] = 2;
            index++;
            white--;
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
