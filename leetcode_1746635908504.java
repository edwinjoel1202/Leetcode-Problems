class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences) {
            int count = str.split("\\s+").length;
            if(count > max)
                max = count;
        }
        return max;
    }
}