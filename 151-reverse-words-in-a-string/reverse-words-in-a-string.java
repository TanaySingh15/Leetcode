class Solution {
    public String reverseWords(String s) {
        Stack<Character> stk=new Stack<>();
        String w="",str="";
        s=s+" ";
        for(char ch:s.toCharArray()){
            if(ch==' '){
                if(!w.equals(""))
                {
                    str=str+w+" ";
                    w="";
                }
            } else{
                w=ch+w;
            }
        }
        return reverse(str).substring(1);
    }
    String reverse(String s){
        String str="";
        for(char ch:s.toCharArray()){
            str=ch+str;
        }
        return str;
    }
}