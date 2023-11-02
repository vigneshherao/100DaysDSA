import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums =  new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        System.out.println(RemoveDuplicates(nums));
    }

    public static List<Integer> RemoveDuplicates(List<Integer> nums){
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(nums.get(0));
        for(int i = 1;i<nums.size();i++){
            if(nums.get(i)!=nums.get(i-1)){
                ans.add(nums.get(i));
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
