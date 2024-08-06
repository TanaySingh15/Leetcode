class Solution {
    public int reverse(int x) {
        int n = x,rev = 0,count =0;
        while(x!=0){
            rev = rev*10 + x%10;
            x=x/10;
            count++;
        }
        double p = (int)(rev/(Math.pow(10,count-1)));
        System.out.println(p+" "+n%10);
        if(p!=n%10){
            return 0;
        }
        else {
            return rev;
        }
    }
}