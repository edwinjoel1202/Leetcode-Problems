class lengthOfLastWord {
    public int LLW(String s) {
        String s1 = s.trim();

        if(s1.isEmpty())
            return 0;
            
        int count = 0;
        for(int i = s1.length() - 1; i >=0; i--) {
            if(s1.charAt(i) == ' ')
                break;
            else
                count += 1;
        }
        return count;
    }
}