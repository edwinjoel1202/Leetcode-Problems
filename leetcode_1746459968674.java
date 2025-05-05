class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int highest = Integer.MIN_VALUE;

        for(int i = 0; i < m; i++){
            int wealth = 0;
            for(int j = 0; j < n; j++){
                wealth += accounts[i][j];
            }

            if(wealth > highest){
                highest = wealth;
            }
        }

        return highest;
    }
}