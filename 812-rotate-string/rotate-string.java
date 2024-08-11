class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()) return false;
        goal = goal+goal;
        return goal.indexOf(s)!=-1;
    }
}