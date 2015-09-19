package Controller;

import Model.*;

public class BabelTower {
    private Tower initialMatrix=new Tower();
    private Tower finalMatrix=new Tower();
    /*public static void main(String[] args) {        
       int [][] matriz = {{4,4,4,-1},{1,1,1,1},{2,2,2,2},{8,4,5,12}};
       
          Tower inicio=new Tower();
          inicio.setMatrix(matriz);
       
       System.out.println(inicio.getMatrix());
            System.out.println(inicio.isIsCorrect());
          //System.out.println(inicio.isCorrect);
   
    }*/
    
    
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
        
        boolean [] IsValid={initialMatrix.isCorrect,finalMatrix.isCorrect};
        return IsValid;
        
    }
    
}
