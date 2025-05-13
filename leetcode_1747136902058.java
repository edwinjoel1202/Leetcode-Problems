class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> hm = new HashMap<>();
        
        for(int i = 0; i < names.length; i++) {
            hm.put( heights[i], names[i]);
        }

        for(int i = 0; i < heights.length; i++) {
            int minIndex = i;
            for(int j = i+1; j < heights.length; j++) {
                if(heights[j] < heights[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = heights[i];
            heights[i] = heights[minIndex];
            heights[minIndex] = temp;
        }

        String[] arr = new String[names.length];

        int index = 0;
        for(int i = heights.length - 1; i >= 0; i--) {
            arr[index++] = hm.get(heights[i]);
        }

        return arr;
    }
}