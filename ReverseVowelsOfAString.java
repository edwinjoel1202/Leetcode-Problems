class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int pointer1 = 0;
        int pointer2 = s.length() - 1;
        String vowels = "aeiouAEIOU";

        
        while(pointer1 < pointer2) {
           
            while(pointer1 < pointer2 && !isVowel(arr[pointer1]))
                pointer1++;

            while(pointer1 < pointer2 && !isVowel(arr[pointer2]))
                pointer2--;
            
            if(pointer1 < pointer2){
                char temp = arr[pointer2];
                arr[pointer2] = arr[pointer1];
                arr[pointer1] = temp;
                pointer1++;
                pointer2--;
            }
        }  
        return new String(arr); 
    }

    public boolean isVowel(char c){
        return "aieouAEIOU".indexOf(c) != -1;
    }
}