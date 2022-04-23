class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        
        row.add(1);
        main.add(row);
        
        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prev = main.get(i-1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            for(int j = 1 ; j < i ; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            main.add(curr);
        }
        
        return main;
    }
}