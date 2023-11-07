public class StringCompress {
    public static void main(String[] args) {
        String s = "aaabbccc";
        String ch ="";
        for(int i = 0; i<s.length();i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            ch+=s.charAt(i);
            if(count>1){
                ch+=count.toString();
            }
            
        }
        System.out.println(ch);
    }
}
