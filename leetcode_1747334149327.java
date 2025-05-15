class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int pref_length = pref.length();
        int count = 0;

        for(String str : words) { 
            if(str.length() >= pref_length) {
                String pref_str = str.substring(0, pref_length);
                if(pref_str.equals(pref))
                    count++;
            }
        }

        return count;
    }
}