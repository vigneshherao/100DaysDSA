public class CountSmallerThanCurrent{
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};

        int count = 0;
        int newArr[] = new int[arr.length];



        for(int i = 0; i<arr.length;i++){
            for(int j= 0; j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count+=1;
                }

            }
            newArr[i] = count;
            count = 0;
        }



        for(int i :newArr){
            System.out.println(i);
        }
    }
}