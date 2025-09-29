class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;
        int count = 0;

        while (count < size) {
            // Left → Right
            for (int i = startCol; i <= endCol && count < size; i++) {
                result.add(matrix[startRow][i]);
                count++;
            }
            startRow++;

            // Top → Bottom
            for (int i = startRow; i <= endRow && count < size; i++) {
                result.add(matrix[i][endCol]);
                count++;
            }
            endCol--;

            // Right → Left
            for (int i = endCol; i >= startCol && count < size; i--) {
                result.add(matrix[endRow][i]);
                count++;
            }
            endRow--;

            // Bottom → Top
            for (int i = endRow; i >= startRow && count < size; i--) {
                result.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }

        return result;
    }
}
