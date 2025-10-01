class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int n=s.length();
        int[] fre=new int[26];
        int maxlen=0;
        int maxcou=0;
        for(int high=0;high<n;high++){
            fre[s.charAt(high)-'A']++;
            maxcou=Math.max(maxcou,fre[s.charAt(high)-'A']);
            while(((high-low+1)-maxcou)>k){
                fre[s.charAt(low)-'A']--;
                low++;
            }
            maxlen=Math.max(maxlen,high-low+1);
        }
        return maxlen;
    }
}
