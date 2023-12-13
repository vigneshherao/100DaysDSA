public class FriendsParing {
    public static void main(String[] args) {
        System.out.println(TotalWays(4));
    }

    public static int TotalWays(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = TotalWays(n-1);
        int fnm2 = TotalWays(n-2);
        int pairWays = fnm1 * fnm2;

        int totalways = fnm1 + pairWays;
        return totalways;
    }
}
