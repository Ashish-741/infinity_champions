class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = -1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (right < n) {
            // expand window
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            // shrink window if more than k distinct
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            
            // check valid window
            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            right++;
        }
        
        return maxLen;
    }
}
