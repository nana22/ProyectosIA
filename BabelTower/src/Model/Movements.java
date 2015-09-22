
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
    
    public int getColumnBlankSpace(int[][] matrix){
        int column=-1;
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix[j].length;i++){
               if(matrix[j][i]==-1){
                   column=i;
               }
            }
        }
        
        return column;
    }
    
    public int getRowBlankSpace(int[][] matrix){
        int row=-1;
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix[j].length;i++){
               if(matrix[j][i]==-1){
                   row=j;
               }
            }
        } 
        return row;
    }
    
    public int[][] MoveDown(int[][] matrix){//Espacio queda abajo
        int row=getRowBlankSpace(matrix);
        if(row<matrix.length-1)
        {
        int column=getColumnBlankSpace(matrix);
        int element=matrix[row+1][column];
        //System.out.println("elemento "+element+ "fila "+ row+" columna "+row);
        matrix[row][column]=element;
        matrix[row+1][column]=-1;
        }
        else
            return null;
        return matrix;
    }
    
    public int[][] MoveUp(int[][] matrix){//Espacio queda arriba
        int row=getRowBlankSpace(matrix);
        if(row>0){
        int column=getColumnBlankSpace(matrix);
        int element=matrix[row-1][column];
        //System.out.println("elemento "+element+ "fila "+ row+" columna "+row);
        if(element!=5){
        matrix[row][column]=element;
        matrix[row-1][column]=-1;}
        else return null;
        }
        else
            return null;
        return matrix;
    }
    public void MoveColumn(int[][]matrix){//Realiza el movimiento de columna permitido
        Tower t=new Tower();
        int row=getRowBlankSpace(matrix); 
        if(row==0){//Esta en la primera fila
            System.out.println("Muevo espacio hacia abajo el espacio");
            t.setMatrix(MoveDown(matrix));   
            t.printMatrix();
        }
        else if(row==4){//Esta en la última fila
            System.out.println("Muevo espacio hacia arriba el espacio");
            t.setMatrix(MoveUp(matrix));   
            t.printMatrix();           
        }
        else{//Esta en el medio
            System.out.println("Muevo espacio hacia abajo el espacio");
            t.setMatrix(MoveDown(matrix));   
            t.printMatrix();
            System.out.println("Muevo espacio hacia arriba el espacio");
            t.setMatrix(MoveUp(matrix));   
            t.printMatrix();
        }
    }
    
    

}
