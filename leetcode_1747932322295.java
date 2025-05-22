class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int ans1 = 0;
        int ans2 = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(nums1[i] == nums2[j]) {
                    ans1++;
                    break;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(nums2[i] == nums1[j]) {
                    ans2++;
                    break;
                }
            }
        }

        return new int[]{ans1, ans2};
    }
}