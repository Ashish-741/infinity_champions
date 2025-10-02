class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sort the interval matrix acc to its last value
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        int n=intervals.length;
        int count=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //the last value of each intervals must be greater or eual to first value of other intervals
            if(intervals[i][0]<last){
                count++;
            }else{
                last=intervals[i][1];
            }
        }
        return count;
    }
}
