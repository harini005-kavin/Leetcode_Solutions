class Solution {
    public String reverseWords(String s) {
        // remove leading/trailing spaces and split by spaces
        String[] words = s.trim().split("\\s+"); 
        
        StringBuilder sb = new StringBuilder();
        
        // traverse from end to start
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" "); // add space between words
        }
        
        return sb.toString();
    }
}