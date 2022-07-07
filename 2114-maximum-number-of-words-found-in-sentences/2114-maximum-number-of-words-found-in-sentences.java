class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        
        for(int i = 0 ; i < sentences.length ; i++){
            String str[] = sentences[i].split(" ");
            count = Math.max(str.length,count);
        }
        return count;
    }
}