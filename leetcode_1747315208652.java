class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;

        double[] arr = new double[n / 2];

        for(int j = 0; j < n / 2; j++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxIndex = 0;
            int minIndex = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] != 0) {
                    if(nums[i] > max) {
                        max = nums[i];
                        maxIndex = i;
                    }
                    
                    if(nums[i] < min) {
                        min = nums[i];
                        minIndex = i;
                    }
                }
            }

            nums[maxIndex] = 0;
            nums[minIndex] = 0;

            double avg = (double)(max + min) / 2;

            arr[j] = avg;
        }

        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}