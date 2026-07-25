import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<String> result) {
        if (path.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break;

            String part = s.substring(start, start + len);
            if (isValid(part)) {
                path.add(part);
                backtrack(s, start + len, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isValid(String part) {
        if (part.length() > 1 && part.startsWith("0")) return false;
        int val = Integer.parseInt(part);
        return val >= 0 && val <= 255;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "25525511135";
        System.out.println(sol.restoreIpAddresses(s1)); 
        // Output: [255.255.11.135, 255.255.111.35]

        String s2 = "0000";
        System.out.println(sol.restoreIpAddresses(s2)); 
        // Output: [0.0.0.0]
    }
}
