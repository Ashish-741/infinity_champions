//first we will sort them in terms of end point
//we make an arrow variable that keep it at last of 1st point ans if next point start is > arrow  postion then arrow++,oterwise not.

// First arrow at 6 pops [1,6] and [2,8] (because 6 is inside both).
// Next balloon [7,12] starts at 7 > 6 → old arrow can’t reach.
// New arrow at 12 pops [7,12] and [10,16] (because 12 is inside both).
// Done. Arrows used = 2.


class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));//this is used to sort the point on basis of 2nd value

        int arrow=1;
        int arrowposition=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>arrowposition){
                arrow++;
                arrowposition=points[i][1];
            }
        }
        return arrow;
    }
}