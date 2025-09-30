class Solution {
    public int lengthOfLongestSubstring(String s) {
        // ArrayList<Character> list = new ArrayList<>();
        HashSet<Character> set=new HashSet<>();
        int ans = 0;
        int low = 0;
        int high = 0;

        while (high < s.length()) {
            char c = s.charAt(high);
            if (!set.contains(c)) {
                // list.add(c);
                set.add(c);
                // ans = Math.max(ans, list.size());
                ans=Math.max(ans,set.size());
                high++;
            } else {
                // list.remove(0);
                set.remove(s.charAt(low));
                low++;
            }
        }
        return ans;
    }
}
