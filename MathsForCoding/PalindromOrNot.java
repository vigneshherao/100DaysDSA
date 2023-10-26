package MathsForCoding;

import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {
        //Taking input from the users
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int newNum = number;
        int checkNumber = 0;
        while(number!=0){
            int lastDigit = number%10;
            checkNumber = checkNumber * 10 + lastDigit;
            number = number / 10;
        }
        String result =(newNum!=checkNumber)? "not a palindrome":"palindrome";
        System.out.println(result);


    }
}
