class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }

        int longStreak = 0;

        for(int num : hs){
            if(!hs.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(hs.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }
}