package Recursion;

public class tiling {
    public static void main(String[] args) {
        System.out.println(ways(2,4));
    }

    public static int ways(int x,int n){
        if(n==0 || n==1){
            return 1;
        }

        int first = ways(x, n-1);
        int two = ways(x,n-2);

        return first+two;
    }
}
