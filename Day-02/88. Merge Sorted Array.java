import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

            //this is the brute force apporach
           for(int i=0;i<n;i++){
                nums1[m]=nums2[i];
                m++;
           }
            Arrays.sort(nums1);


        //this is the optimized apporahc
        int nums1poi=m-1;
        int nums2poi=n-1;
        int k=m+n-1;
        while(nums1poi>=0 && nums2poi>=0){
            if(nums1[nums1poi]<=nums2[nums2poi]){
                nums1[k]=nums2[nums2poi];
                nums2poi--;
                k--;
            }else{
                nums1[k]=nums1[nums1poi];
                k--;
                nums1poi--;
            }
        }
        while (nums2poi >= 0) {
            nums1[k] = nums2[nums2poi];
            nums2poi--;
            k--;
        }
        
    }
