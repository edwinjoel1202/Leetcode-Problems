
class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if (count == 0)
                element = nums[i];
            count += (nums[i] == element) ? 1 : -1;
        }
        return element;
    }
}