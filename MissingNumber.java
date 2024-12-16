class MissingNumber {
    public int missingNumber(int[] nums) {
        int acS = (nums.length * ( nums.length + 1)) / 2;
        int arS = 0;
        for(int n : nums)
            arS += n;
        return acS - arS;
    }
}