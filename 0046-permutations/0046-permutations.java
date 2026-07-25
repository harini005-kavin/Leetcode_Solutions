class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        // If one permutation is complete
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp)); // add a copy
            return;
        }

        // Try each number
        for (int num : nums) {
            if (temp.contains(num)) continue; // skip already used numbers

            temp.add(num);        // choose
            backtrack(result, temp, nums); // explore
            temp.remove(temp.size() - 1);  // un-choose (backtrack)
        }
    }
}
