class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int sum = 0;
            while(val > 0) {
                int temp = val % 10;
                sum += temp;
                val /= 10;
            }

            nums[i] = sum;
            if(sum < min)
                min = sum;
        }

        return min;
    }
}