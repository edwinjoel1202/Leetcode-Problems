class Solution {
    public String reversePrefix(String word, char ch) {
        
        StringBuilder str = new StringBuilder();

        int end = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                end = i;
                break;
            }
        }

        for(int i = end; i >=0; i--) {
            str.append(word.charAt(i));
        }

        for(int i = end + 1; i < word.length(); i++) {
            str.append(word.charAt(i));
        }

        return str.toString();
    }
}