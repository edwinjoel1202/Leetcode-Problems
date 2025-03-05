class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int row : rows){
            for(int j = 0; j< m; j++){
                matrix[row][j] = 0;
            }
        }

        for(int col : columns){
            for(int i = 0; i < n; i++){
                matrix[i][col] = 0;
            }
        }
    }
}