class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int arr_pointer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                arr[arr_pointer++] = key;
                if(arr_pointer == 2)
                    break;
            }
        }
        return arr;
    }
}