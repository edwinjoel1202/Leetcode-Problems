class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot)
                left.add(nums[i]);
            else if(nums[i] > pivot) 
                right.add(nums[i]);
            else
                middle.add(nums[i]);
        }

        int j = 0;

        for(int i = 0; i < left.size(); i++)
            nums[j++] = left.get(i);

        for(int i = 0; i < middle.size(); i++)
            nums[j++] = middle.get(i);

        for(int i = 0; i < right.size(); i++)
            nums[j++] = right.get(i);

        return nums;
    }

}