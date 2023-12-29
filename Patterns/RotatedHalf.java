public class RotatedHalf {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=4-i;j++){
                // if((i+j==5)||(i+j==6)||(i+j==7)||(i+j==8)){
                //     System.out.print("*");
                // }
                // else{
                //     System.out.print(" ");
                // }
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
