
package Model;


public class Movements {
    
    public int[][] MoveToLeftRow(int row, int[][] matrix){
        int length = matrix[row].length;
        int finalElement = matrix[row][0];
        for (int k=0; k<length-1; k++){
            matrix[row][k] = matrix[row][k+1];
        }
        matrix[row][length-1] = finalElement;
        return matrix;
    }
  

    public  int[][] MoveToRightRow(int row, int[][] matrix) {
        int length = matrix[row].length;
        int firstElement = matrix[row][length-1];
        for (int k=length-1; k>=1; k--){
            matrix[row][k] = matrix[row][k-1];
        }
        matrix[row][0] = firstElement;
        return matrix;
    }

}
