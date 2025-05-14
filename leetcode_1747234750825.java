class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }

        int digitSum = 0;

        for(int i = 0; i< nums.length; i++) {
            int temp = nums[i];
            while(temp != 0) {
                int unitDigit = temp % 10;
                temp -= unitDigit;
                temp /= 10;

                digitSum += unitDigit;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}