class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for(int num : nums){
            int rem = num % 3;
            if(rem != 0)
                count += Math.min(rem, 3 - rem);
        }

        return count;
    }
}