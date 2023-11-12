package TwoDArrays;
public class NoOfSevens {
    public static void main(String[] args) {
        int arr[][] = { {7,7,8},{8,8,7} };
        int key = 7;
        int count = 0;
        for(int i = 0; i<arr.length;i++){
           for(int j = 0;j<arr[0].length;j++){
            if(arr[i][j]==key){
                count+=1;
            }
           }
        }
        System.out.println(count);
    }
}
