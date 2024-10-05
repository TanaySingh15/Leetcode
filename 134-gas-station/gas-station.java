class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        return tour(gas,cost);
    }
    int tour(int petrol[], int distance[])
    {
        int start = 0, deficit = 0;
        int capacity = 0,n=petrol.length;
        for (int i = 0; i < n; i++) {
            capacity += petrol[i] - distance[i];
            if (capacity < 0) {
                start = i + 1;
                deficit += capacity;
                capacity = 0;
            }
        }
        return (capacity + deficit >= 0) ? start : -1;
    }
}