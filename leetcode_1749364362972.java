class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();

        int count = 0;

        for(char chr : s.toCharArray()) {
            if(chr == '(') {
                if(count > 0)
                    str.append(chr);
                count++;
            } else if(chr == ')') {
                count--;
                if(count > 0)
                    str.append(chr);

            }
        }

        return str.toString();
    }
}