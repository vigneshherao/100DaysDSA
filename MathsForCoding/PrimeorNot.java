package MathsForCoding;

public class PrimeorNot {
    public static void main(String[] args) {
        int a = 10;
        for(int i = 2;i<Math.sqrt(a);i++){
            if(a%2==0){
                System.out.println("not a prime");
                break;
            }
        }
        System.out.println("prime number");
    }
}
