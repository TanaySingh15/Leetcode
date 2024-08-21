class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max=logs[0][1]; //we get the max value difference
        for(int i=1;i<logs.length;i++){
            max=Math.max(max,logs[i][1]-logs[i-1][1]);
        }
        //take a list add id's withb is equal to difference
        List<Integer> list=new ArrayList<>();
        if(max==logs[0][1]){
            list.add(logs[0][0]);
        }
        //similary go through entire logs array
        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]==max){
                list.add(logs[i][0]);
            }
        }
        //in case of example 3
        //difference is 10 units repeated in two times as per question we should get smallest id so we should sort list array
        Collections.sort(list);
        return list.get(0);
    }
}