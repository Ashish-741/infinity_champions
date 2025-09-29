class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=matrix[0].length-1;
        int row=matrix.length-1;
        int currrow=0;
        int currcol=col;
        while(currrow<=row && currcol>=0){
            int val=matrix[currrow][currcol];
            if(val==target){
                return true;
            }else if(val>target){
                currcol--;
            }else{
                currrow++;
            }
        }
        return false;
    }
}
