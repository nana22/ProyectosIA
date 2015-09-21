package Model;
import java.util.Comparator;
import java.util.Arrays;

public class Tower {
    public int[][] matrix;
    public boolean isCorrect;
    public int diferencia;
    public int cost;    
    public int g;    
    public int h;
    private Tower padre;
    
    
    public int[][] getMatrix() {
        return matrix;
    }
    
    public Tower getPadre()
    {
        return this.padre;
    }
    
    public int getDiffer()
    {
        return this.diferencia;
    }
    
    public int getCost()
    {
        return this.cost;
    }

    public int getG()
    {
        return g;
    }
    
    public int getH()
    {
        return h;
    }
    
    public int getF()
    {
        return this.g+this.h;
    }
    
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public void setPadre(Tower padre)
    {
        this.padre=padre;
    }

    public void setDiff( int value)
    {
        this.diferencia=value;
    }
    
    public void setCost( int  c)
    {
        this.cost=c;
    }
    
    public void setG(int g)
    {
        this.g=g;
    }
    
    public void setH(int h)
    {
        this.h=h;
    }
    
    public void printMatrix() {
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix[j].length;i++){
               System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }
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
   
    
    public int compareTo(Tower compareT)
    {
        int[][] aux = compareT.getMatrix();
        int[][] actual = this.getMatrix();
        for(int i=0;i<aux.length;i++)
        {
            for(int j=0;j<aux[i].length;j++)
            {
                if(aux[i][j]!=actual[i][j])
                    return 1;
            }
        }
        
    return 0;
        
    }
    
     public static Comparator<Tower> TowerFComparator = new Comparator<Tower>() {

        @Override
        public int compare(Tower o1, Tower o2) {
           return new Integer(o1.getF()).compareTo(new Integer(o2.getF()));
        }
    };
    
    
    public boolean equals(Tower t1)
    {
        boolean same=false;
        if(t1!=null)
            same = compareTo(t1)==0;
        return same;
    }  
    
}
