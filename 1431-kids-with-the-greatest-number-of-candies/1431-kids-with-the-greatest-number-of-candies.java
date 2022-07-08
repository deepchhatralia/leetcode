class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst = new ArrayList<Boolean>();
        
        for(int i = 0 ; i < candies.length ; i++){
            boolean flag = false;
            
            for(int j = 0 ; j < candies.length ; j++){
                if(candies[j] > candies[i] + extraCandies){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            lst.add(flag);
        }
        
        return lst;
    }
}