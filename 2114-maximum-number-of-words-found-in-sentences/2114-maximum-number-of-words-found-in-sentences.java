class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        
        for(int i = 0 ; i < sentences.length ; i++){
            int current = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    current++;
                }
            }
            if(current>=count) {
                count = current+1;
            };
        }
        return count;
    }
}