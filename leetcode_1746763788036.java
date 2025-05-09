class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.split(" ");
        
        for(int i = 0; i < k; i++){
            if( i < arr.length) {
                str.append(arr[i]);
                str.append(" ");
            }
        }

        return str.toString().trim();
    }
}