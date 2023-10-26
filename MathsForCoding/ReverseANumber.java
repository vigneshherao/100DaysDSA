package MathsForCoding;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        //Taking input from the users
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int reverse = 0;
        while(number!=0){
            int lastDigit = number%10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);


    }
}