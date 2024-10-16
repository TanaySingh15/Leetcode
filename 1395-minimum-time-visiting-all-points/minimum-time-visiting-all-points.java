class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        for(int i=0;i<points.length-1;i++){
            totalTime+= time(points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
        }
        return totalTime;
    }
    
    static int time(int x1,int y1,int x2,int y2){
        System.out.println("["+x1+","+y1+"]");
        System.out.println("["+x2+","+y2+"]");
        int time = 0;
        if(x1 == x2){
            time = Math.abs(y1-y2);
        } else if(y1 == y2){
            time = Math.abs(x1-x2);
        } else {
            int x = Math.abs(x1-x2);
            int y = Math.abs(y1-y2);
            System.out.println("x: "+x);
            System.out.println("y: "+y);
            if(x<y){
                time+= x;
                time+= y-x;
            } else if(x>y){
                time+= y;
                time+= x-y;
            } else {
                time+=x;
            }
        }
        return time;
    }
}