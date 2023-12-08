package BitWise;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        boolean result = ((a & 1)==1)? false:true;
        System.out.println(result);
    }
}
