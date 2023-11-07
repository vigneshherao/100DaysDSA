public class SwapString {
    public static void main(String[] args) {
        String s[] = {"h","e","l","l","o"};
        String temp = "";
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        } 

        for(String i :s){
            System.err.println(i);
        }
    }
}
