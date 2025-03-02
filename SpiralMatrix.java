import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // Handle empty matrix case
        if (matrix.length == 0 || matrix[0].length == 0) {
            return result; // Return empty list if the matrix is empty
        }

        int column_start = 0;
        int row_start = 0;
        int column_end = matrix[0].length - 1; // Adjusted to be inclusive
        int row_end = matrix.length - 1; // Adjusted to be inclusive

        while (column_start <= column_end && row_start <= row_end) {
            // Traverse from left to right
            for (int i = column_start; i <= column_end; i++) {
                result.add(matrix[row_start][i]);
            }
            row_start++;

            // Traverse from top to bottom
            for (int i = row_start; i <= row_end; i++) {
                result.add(matrix[i][column_end]);
            }
            column_end--;

            // Check if there are remaining rows to traverse
            if (row_start <= row_end) {
                // Traverse from right to left
                for (int i = column_end; i >= column_start; i--) {
                    result.add(matrix[row_end][i]);
                }
                row_end--;
            }

            // Check if there are remaining columns to traverse
            if (column_start <= column_end) {
                // Traverse from bottom to top
                for (int i = row_end; i >= row_start; i--) {
                    result.add(matrix[i][column_start]);
                }
                column_start++;
            }
        }

        return result;
    }
}