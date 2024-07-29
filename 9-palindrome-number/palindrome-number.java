class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x,n1=0;
        while(n!=0){
            n1=n1*10+(n%10);
            n=n/10;
        }
        System.out.println(n1);
        return n1==x;
    }
}