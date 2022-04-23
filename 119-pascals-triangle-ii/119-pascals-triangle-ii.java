class Solution {
    public List<Integer> getRow(int rowIndex) {     
        if(rowIndex == 1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            temp.add(1);
            return temp;
        }
        
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        main.add(row);
        
        for(int i = 1 ; i <= rowIndex ; i++){
            List<Integer> prev = main.get(i-1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            for(int j = 1 ; j < i ; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            main.add(curr);
        }
        
        return main.get(main.size()-1);
    }
}