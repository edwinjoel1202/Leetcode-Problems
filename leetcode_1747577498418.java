class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();
        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int moves = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == '1') {
                    moves += Math.abs(i - j);
                }
            }

            res[i] = moves;
        }

        return res;
    }
}