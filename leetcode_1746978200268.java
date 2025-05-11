class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int var1 = Math.abs(arr[i] - arr[j]);
                    int var2 = Math.abs(arr[j] - arr[k]);
                    int var3 = Math.abs(arr[i] - arr[k]);

                    if (var1 <= a && var2 <= b && var3 <= c)
                        count++;
                }
            }
        }

        return count;
    }
}