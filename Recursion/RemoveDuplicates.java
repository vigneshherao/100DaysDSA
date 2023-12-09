public class RemoveDuplicates{
    public static void main(String[] args) {
        String check = "abbaca";
        int index = 0;
        StringBuilder newStr = new StringBuilder();
        int map[] = new int[26];
        RemoveDeuplicate(check,index,newStr,map);
       
    }
    public static void RemoveDeuplicate(String check,int index,StringBuilder newStr,int map[]){
        if(index == check.length()){
            System.out.println(newStr);
            return;
        }

        char currChar =  check.charAt(index);
        if(map[currChar-'a']==1){
            RemoveDeuplicate(check,index+1,newStr,map);
        }
        else{
            map[currChar-'a'] = 1;
            RemoveDeuplicate(check,index+1,newStr.append(currChar),map);
        }
    }
}