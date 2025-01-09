class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        for(int i = 1; i < words.length; i++){
            String current = words[i - 1];
            String next = words[i];

            if(! (current.charAt(current.length() - 1) == next.charAt(0)) ){
                    return false;
            }
        }

        if (words[words.length - 1].charAt(words[words.length - 1].length() - 1) != words[0].charAt(0)) {
            return false;
        }

        return true;
    }
}