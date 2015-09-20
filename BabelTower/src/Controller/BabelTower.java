package Controller;

import Model.CheckTower;
import Model.*;
import java.io.File;
import java.io.IOException;

public class BabelTower {
    private Tower initialMatrix=new Tower();
    private Tower finalMatrix=new Tower();
    private Txt text = new Txt();
    Movements movements=new Movements();
    
    /*public static void main(String[] args) {        
       int [][] matriz = {{4,4,4,-1},{1,1,1,1},{2,2,2,2},{8,4,5,12}};
       
          Tower inicio=new Tower();
          inicio.setMatrix(matriz);
       
       System.out.println(inicio.getMatrix());
        Movements m=new Movements();
        m.shiftRight(i, matriz);
          //System.out.println(inicio.isCorrect);
   
    }*/
    
    public String ReadTxt(File file) throws IOException{
        return text.Read(file);
    }
    
    public void WriteTxt(String Text){
        text.Write(Text);
    }
    

    
    
    public boolean[] ConvertMatrix(String InitialMatrix,String FinalMatrix){
        System.out.println(InitialMatrix);
        initialMatrix.setMatrix(initialMatrix.ConvertMatrix(InitialMatrix));
        initialMatrix.printMatrix();
        CheckTower check= new CheckTower();
        initialMatrix.isCorrect=check.isIsCorrect(initialMatrix.matrix);
        System.out.println(check.isIsCorrect(initialMatrix.matrix));
        
        finalMatrix.setMatrix(finalMatrix.ConvertMatrix(FinalMatrix));
        finalMatrix.printMatrix();
        finalMatrix.isCorrect=check.isIsCorrect(finalMatrix.matrix);
        System.out.println(check.isIsCorrect(finalMatrix.matrix));
        
        
        boolean [] IsValid={initialMatrix.isCorrect,finalMatrix.isCorrect};//retorna si la matrices tienen configuraciones correctas
        return IsValid;        
    }
     
    /*probando funciones
        System.out.println("Mueve a la derecha, la fila 3 de la configuracion inicial");
        initialMatrix.setMatrix(movements.MoveToRightRow(3, initialMatrix.getMatrix()));
        initialMatrix.printMatrix();
        
        System.out.println("Mueve a la izquierda, la fila 4 de la configuracion inicial");
        initialMatrix.setMatrix(movements.MoveToLeftRow(4, initialMatrix.getMatrix()));
        initialMatrix.printMatrix();
        */
        
        /*System.out.println("Muevo espacio hacia abajo configuracion inicial");
        initialMatrix.setMatrix(movements.MoveDown( initialMatrix.getMatrix()));
        initialMatrix.printMatrix();
        
        System.out.println("Muevo espacio hacia arriba configuracion inicial");
        initialMatrix.setMatrix(movements.MoveUp( initialMatrix.getMatrix()));
        initialMatrix.printMatrix();
        System.out.println("Movimiento columna");
        movements.MoveColumn( initialMatrix.getMatrix());
        
        Algorithm a=new Algorithm();
        a.open.add(initialMatrix);
        System.out.println(a.CheckOpen(initialMatrix.getMatrix()));*/
}
