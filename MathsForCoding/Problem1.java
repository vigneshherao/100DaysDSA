package MathsForCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        //we are taking input from the user
        int num = obj.nextInt();
        //we are looping only half of the numbers with sqrt
        for(int i = 1; i<Math.sqrt(num);i++){   
            if(num % i == 0){
                arr.add(i);
                int newNum = num / i;
                arr.add(newNum);
            }
        }

        // we can check the numbers that are divisible by number

        for (Integer i : arr) {
                System.out.println("This number is divisible by num :"+ i);
        }
    }
}