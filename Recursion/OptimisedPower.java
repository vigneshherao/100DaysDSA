package Recursion;

public class OptimisedPower {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Pow(x,n));
    }
    public static int Pow(int x,int n){
        if(n==0){
            return 1;
        }

        int half = Pow(x, n/2);
        int newHalf = half * half;

        if(n % 2 !=0){
            newHalf = x * newHalf;
        }

        return newHalf;
    }
}
