class Solution {
    public int[] numberGame(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        for(int i = 0; i < nums.length; i+=2) {
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
        }

        return arr;
    }
}