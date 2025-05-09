class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i+=2) {
            int val = nums[i + 1];
            int freq = nums[i];

            for(int j = 0; j < freq; j++) {
                res.add(val);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}