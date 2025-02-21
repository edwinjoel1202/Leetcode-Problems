class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = nums.length;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target)
            {
                res = i;
                break;
            }
        }
        return res;
    }
}