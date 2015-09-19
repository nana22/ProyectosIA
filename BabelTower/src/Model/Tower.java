package Model;


public class Tower {
    public int[][] matrix;
    public boolean isCorrect;
    public int cost;
    
    
    
    public int[][] getMatrix() {
        return matrix;
    }
    
    public void printMatrix() {
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix[j].length;i++){
               System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }



    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    
    // Lenguaje definido:
    //1 verde,2 amarillo, 3 rojo, 4 azul,-1 espacio, 5 negro(block)
    public int[][] ConvertMatrix(String Matrix){        
        String[] rows = Matrix.trim().split("\n");//separo en filas
        matrix = new int[rows.length][];         
        for (int i = 0; i < rows.length; i++) {
            String[] row = rows[i].trim().split(" "); //la fila la separo en columnas
            matrix[i] = new int[row.length];            
            for(int j=0; j < row.length; j++) {
                if(row[j].trim().equals("verde")){
                    matrix[i][j]=1;
                }
                if(row[j].trim().equals("amarillo")){
                    matrix[i][j]=2;
                }
                if(row[j].trim().equals("rojo")){
                    matrix[i][j]=3;
                }
                if(row[j].trim().equals("azul")){
                    matrix[i][j]=4;
                }
                if(row[j].trim().equals("espacio")){
                    matrix[i][j]=-1;
                }
                if(row[j].trim().equals("negro")){
                    matrix[i][j]=5;
                }
            }
        }
        return matrix;
        
    }  
    
}
