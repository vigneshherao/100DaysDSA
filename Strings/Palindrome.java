public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(CheckPalindrome(s));

    }

    public static boolean CheckPalindrome(String s){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        } 
        return true;  
    }
}
