class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows=new HashSet<Integer>();
        Set<Integer> cols=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int row:rows){
            setrow(row,matrix);
        }
        for(int col:cols){
            setcol(col,matrix);
        }
    }
    public static void setrow(int row,int[][] matrix){
        for(int col=0;col<matrix[0].length;col++){
            matrix[row][col]=0;
        }
    }
    public static void setcol(int col,int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            matrix[row][col]=0;
        }
    }
}
