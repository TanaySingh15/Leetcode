class Solution {
    int maxFreq=0;
    public int characterReplacement(String s, int k) {
        int start=0,end=0;
        
        int result=0;
        Map<Character,Integer> map=new HashMap<>();
        for(;end<s.length();end++){
            char c=s.charAt(end);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            
            if(end-start+1-maxFreq<=k){
                result=Math.max(result,end-start+1);
            }else{
                while(end-start+1-maxFreq>k){
                    removeFromMap(s.charAt(start++),map);
                }
            }
        }
        
        return result;
    }
    
    public void removeFromMap(char c,Map<Character,Integer> map){
        
        if(map.get(c)==1){
            map.remove(c);
        }else{
            map.put(c,map.get(c)-1);
            if(map.get(c)+1==maxFreq){
                setMaxFreq(map);
            }
        }
    }
    
    public void setMaxFreq(Map<Character,Integer> map){
        for(char k:map.keySet()){
            this.maxFreq=Math.max(this.maxFreq,map.get(k));
        }
    }
}