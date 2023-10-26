package MathsForCoding;

public class CountTheNumbers {
    public static void main(String[] args) {
        int number = 1290190;
        int count = 0;
        //we have to use while loop with conditon to check it is not zero
        while(number!=0){
             number = number / 10;
             count++;
        }

        System.out.println(count);
    }
}
