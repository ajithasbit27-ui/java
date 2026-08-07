class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Array to store the last seen index of each character (ASCII 128 covers standard characters)
        int[] lastSeen = new int[128];
        
        // Initialize all indices to -1
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        
        // 'left' represents the start of the current valid substring window
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen inside the current window, move 'left' right past its previous index
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }
            
            // Update the last seen position of the character
            lastSeen[currentChar] = right;
            
            // Calculate and update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
