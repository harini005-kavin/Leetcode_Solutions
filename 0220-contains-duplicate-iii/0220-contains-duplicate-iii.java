class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            // Find the smallest number >= num - valueDiff
            Long candidate = set.ceiling(num - valueDiff);

            // Check if candidate is within valueDiff range
            if (candidate != null && candidate <= num + valueDiff) {
                return true;
            }

            set.add(num);

            // Keep window size <= indexDiff
            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}

    
