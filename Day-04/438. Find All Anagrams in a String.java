import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length(), k = p.length();
        if (n < k) return list;

        int[] pfre = new int[26];
        int[] sfre = new int[26];

        // frequency of p
        for (int i = 0; i < k; i++) {
            pfre[p.charAt(i) - 'a']++;
        }

        // first window
        for (int i = 0; i < k; i++) {
            sfre[s.charAt(i) - 'a']++;
        }

        // check first window
        if (Arrays.equals(pfre, sfre)) list.add(0);

        int slow = 0;
        for (int pointer = k; pointer < n; pointer++) {
            // add new char (entering window)
            sfre[s.charAt(pointer) - 'a']++;
            // remove old char (leaving window)
            sfre[s.charAt(slow) - 'a']--;
            slow++;

            if (Arrays.equals(pfre, sfre)) {
                list.add(slow);
            }
        }

        return list;
    }
}
