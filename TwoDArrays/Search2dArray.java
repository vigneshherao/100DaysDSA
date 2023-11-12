package TwoDArrays;
public class Search2dArray {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(CheckArray(matrix,3));
    }


    public static boolean CheckArray(int[][] matrix,int target){
        int start = 0;
		int end = matrix[0].length-1;
		while(start<matrix.length && end>=0){
		    if(matrix[start][end] == target){
		        return true;
		    }
		    else if(target < matrix[start][end]) {
		        end--;
		    }
		    else{
		        start++;
		    }
		}
       return false;

    }
}
