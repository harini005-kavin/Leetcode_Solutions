class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long b=nums[nums.length-1]-nums[0];
        return b*k;
    }
}