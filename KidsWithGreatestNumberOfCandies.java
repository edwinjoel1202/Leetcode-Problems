class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNum = Integer.MIN_VALUE;
        List<Boolean> arr = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxNum)
                maxNum = candies[i];
        }

        for(int i = 0; i < candies.length; i++){
            int tempCandy = candies[i] + extraCandies;
            if(tempCandy >= maxNum)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
    }
}