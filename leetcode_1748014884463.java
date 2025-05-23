class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if ((end - start + 1) % 2 != 0) {
                    total += sum;
                }
            }
        }

        return total;
    }
}