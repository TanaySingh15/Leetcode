class Solution {
    public int secondHighest(String s) {
        int largest=-1,second=-1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0'&&ch<='9'){
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
}