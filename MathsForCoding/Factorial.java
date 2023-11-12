package MathsForCoding;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        //will take number from the user
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int product = 1;
        for(int i = 1; i<=userInput;i++){
            product = product * i;
        }
        System.out.println(product);
    }
}