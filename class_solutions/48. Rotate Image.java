class Solution {
    public void rotate(int[][] matrix) {
        //first wwe have to transpose the matrix 
        //then after it we have  to reverse the rows
        int rows=matrix.length-1;
        int col=matrix[0].length-1;

        //transpose
        for(int i=0;i<=rows;i++){
            for(int j=i;j<=col;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }

        //reverse the rows
        for(int i=0;i<=rows;i++){
            int low=0;
            int high=col;
            while(low<=high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}
