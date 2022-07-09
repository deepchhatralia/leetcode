class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int what;
        
        if(ruleKey.equals("type"))
            what = 0;
        else if(ruleKey.equals("color"))
            what = 1;
        else
            what = 2;
        
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).get(what).equals(ruleValue)){
                count++;   
            }
        }
      
        return count;
    }
}