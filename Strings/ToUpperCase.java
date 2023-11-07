public class ToUpperCase{
    public static void main(String[] args) {
        String sentence = "hai am vignesh here!";

        StringBuilder toUpper = new StringBuilder("");

        char firstLetter = Character.toUpperCase(sentence.charAt(0));

        toUpper.append(firstLetter);

        for(int i = 1; i<sentence.length();i++){
            if(sentence.charAt(i)==' ' && i<sentence.length()-1){
                toUpper.append(sentence.charAt(i));
                i++;
                toUpper.append(Character.toUpperCase(sentence.charAt(i)));
            }else{
                toUpper.append(sentence.charAt(i));
            }
        }
        System.out.println(toUpper);
    }
}