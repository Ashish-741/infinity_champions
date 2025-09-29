class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            // Step 1: Find minimum element in row i
            int minRow = Integer.MAX_VALUE;
            int minColIndex = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minColIndex = j;
                }
            }

            // Step 2: Check if this element is the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minColIndex] > minRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            // Step 3: If yes, add to result
            if (isMaxInCol) {
                list.add(minRow);
            }
        }

        return list;
    }
}
