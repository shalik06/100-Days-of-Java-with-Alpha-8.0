// Question 3 : Write a program to FindTranspose ofa Matrix.
// What is Transpose?
// Transpose of a matrix is the process ofswapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11    a12    a13
// a21    a22    a23
// Transposed Matrix
// a11    a21
// a12    a22
// a13    a23
public class ThirdQuestion {
    public static int[][] transpose(int[][] matrix) {

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int numRowsTranspose = numCols;
        int numColsTranspose = numRows;

        int TransposeMat[][] = new int[numRowsTranspose][numColsTranspose];

        for (int i = 0; i < numRowsTranspose; i++) {
            for (int j = 0; j < numColsTranspose; j++) {

                TransposeMat[i][j] = matrix[j][i];

            }
        }

        return TransposeMat;
    }

    public static void main(String[] args) {
        int row =2, colos =3;
        int matrix[][] = {{11,12,13},
                           {21,22,23}};
    
            int[][] result = transpose(matrix); 
            // Printing transpose matrix 
            for (int i = 0; i < result.length; i++)
                 { for (int j = 0; j < result[0].length; j++) { 
                    System.out.print(result[i][j] + " "); }
                     System.out.println();
        
    }
}
}
