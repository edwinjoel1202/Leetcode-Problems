class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows <= 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder zigzag = new StringBuilder();
        int cycleLength = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j + row < s.length(); j += cycleLength) {
                zigzag.append(s.charAt(j + row));
                if (row > 0 && row < numRows - 1 && j + cycleLength - row < s.length()) {
                    zigzag.append(s.charAt(j + cycleLength - row));
                }
            }
        }
    return zigzag.toString();
    }
}