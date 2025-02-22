double findMaxAverage(int* nums, int numsSize, int k) {
    double maxAvg = 0;
    double currSum = 0;

    for(int i = 0; i < k; i++){
        currSum += nums[i];
    }

    maxAvg = currSum / k;

    for(int i = k; i < numsSize; i++){
        currSum += nums[i] - nums[i - k];
        double tempAvg = currSum / k;
        if(tempAvg > maxAvg){
            maxAvg = tempAvg;
        }
    }

    return maxAvg;
}