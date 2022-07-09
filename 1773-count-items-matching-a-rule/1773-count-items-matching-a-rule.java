class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int what = 0;
        
        if(ruleKey.equals("color"))
            what = 1;
        else if(ruleKey.equals("name"))
            what = 2;
        
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).get(what).equals(ruleValue)){
                count++;   
            }
        }
      
        return count;
    }
}