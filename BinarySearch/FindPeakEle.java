package BinarySearch;

public class FindPeakEle {
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,5,6,4};
        int s=0,e=nums.length-1,mid;
        while(s<e)
        {
            mid=(s+e)/2;
            if(nums[mid]<nums[mid+1])
            s=mid+1;
            else 
            e=mid;
        }
       System.out.println(s);
    }
}
