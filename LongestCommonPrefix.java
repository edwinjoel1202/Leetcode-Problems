import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String answer = "";
        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) == last.charAt(i)){
                answer = answer + first.charAt(i);
            } else {
                break;
            }
        }

        return answer;
    }
}
