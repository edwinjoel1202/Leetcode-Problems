class TowSumII {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;

        while(index1 < index2){
            int temp_counter = numbers[index1] + numbers[index2];

            if(temp_counter == target) {
                return new int[]{index1 + 1, index2 + 1};
            } else if (temp_counter > target) {
                index2--;
            } else {
                index1++;
            }
        }      
        return new int[]{-1, -1};
    }
}