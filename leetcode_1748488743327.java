class Solution {
    public int scoreOfString(String s) {
        
        int score = 0;

        for(int i = 1; i < s.length(); i++) {
            int c1 = (int) s.charAt(i - 1);
            int c2 = (int) s.charAt(i);

            score += Math.abs(c1 - c2);
        }

        return score;
    }
}