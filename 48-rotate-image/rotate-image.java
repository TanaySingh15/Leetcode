class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                // System.out.println(matrix[i][j]+" "+matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                // System.out.println(matrix[i][j]+" "+matrix[j][i]);
            }
        }

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     // System.out.println();
        // }

        int i=0,j=matrix.length-1;
        while(i<j){
            for(int k=0;k<matrix.length;k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
            i++;
            j--;
        }

    }
}