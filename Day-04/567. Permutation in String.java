import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if (n > m) return false;
        
        int[] s1fre=new int[26];
        int[] s2fre=new int[26];

        for(int i=0;i<n;i++){
            s1fre[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){
            s2fre[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(s1fre,s2fre)){
            return true;
            //here something that breaks the loop
        }

        int slow=0;
        for(int pointer=n;pointer<m;pointer++){

            //add new elemnt in s2fre
            s2fre[s2.charAt(pointer)-'a']++;

            //remove the previos elemnt
            s2fre[s2.charAt(slow)-'a']--;
            slow++;

            //check if it is equal to or not
            if(Arrays.equals(s1fre,s2fre)){
                return true;
        }
    }
    return false;
}
}
