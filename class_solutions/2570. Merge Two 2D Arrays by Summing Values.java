import java.util.*;
//this is brute force apporach using hashmap
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // Add nums1
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i][0], nums1[i][1]);
        }

        // Add nums2, sum values if key exists
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }

        // Convert to list of entries and sort by key
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> a.getKey() - b.getKey());

        // Convert back to int[][] array
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i).getKey();
            result[i][1] = list.get(i).getValue();
        }

        return result;
    }
}
