import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Find elements in nums1 that are not in nums2
        Set<Integer> uniqueToNums1 = new HashSet<>(set1);
        uniqueToNums1.removeAll(set2);
        
        // Find elements in nums2 that are not in nums1
        Set<Integer> uniqueToNums2 = new HashSet<>(set2);
        uniqueToNums2.removeAll(set1);
        
        // Prepare the result
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(uniqueToNums1));
        result.add(new ArrayList<>(uniqueToNums2));
        
        return result;
    }
}