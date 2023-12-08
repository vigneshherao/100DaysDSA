package Recursion;

public class Power {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        System.out.println(Pow(x,n));
    }

    public static int Pow(int x,int n){
        if(n==1){
            return x;
        }

        int ans = x * Pow(x,n-1);

        return ans;
    }
}
