class Solution {
    public int secondHighest(String s) {
        int largest=-1,second=-1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isDigit(ch)){
                int n = ch - '0';
                if(n>largest){
                    second = largest;
                    largest = n;
                } else if(n<largest){
                    if(n>second){
                        second = n;
                    }
                }
            }
        }
        if(largest == second) return -1;
        return second;
    }

    public boolean isDigit(char c){
        return c>='0'&&c<='9';
    }
}