class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        ArrayList<Pair> arr = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            Pair p = new Pair(entry.getKey(),entry.getValue());
            arr.add(p);
        }
        s="";
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=1;j<=arr.get(i).freq;j++)
                s=s+arr.get(i).ch;
        }
        return s;
    }
}

class Pair implements Comparable<Pair> {
    char ch;
    int freq;
    
    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Pair o) {
        return o.freq-freq;
    }
}
