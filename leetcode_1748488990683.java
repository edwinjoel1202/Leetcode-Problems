class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(char chr : address.toCharArray()) {
            if(chr == '.') {
                str.append("[.]");
            }
            else {
                str.append(chr);
            }
        }

        return str.toString();
    }
}