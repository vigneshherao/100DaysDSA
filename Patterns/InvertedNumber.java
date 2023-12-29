public class InvertedNumber {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            for(int j = 1;j<=5-i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
