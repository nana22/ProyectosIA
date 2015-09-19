/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Model.Tower;
/**
 *
 * @author DianaA
 */
public class CheckTower {
    
    
    public boolean isIsCorrect( int[][] matrix) {
       
      int rest=checkBlank(matrix)+checkGreen(matrix)+checkRed(matrix)+checkBlue(matrix)+checkYellow(matrix);
       
       if(rest==5){
       return true;
       }
       else{
       return false;}
    }
    public int checkLenght( int[][] matrix) {
      
        int lengthIncorrect=1;     
        for(int j=matrix.length-1;j>0;j--){
            for(int i=matrix[j].length-1;i>0;i--){
               if(matrix[j][i]==0){
                 lengthIncorrect=0;

               }    
            }
        }
        return lengthIncorrect;
    }
    
    public int checkBlank( int[][] matrix){
       int incorrectAmount=1;     
       int contBlank=0;
        for(int j=matrix.length-1;j>-1;j--){
            for(int i=matrix[j].length-1;i>-1;i--){
               if(matrix[j][i]==-1){
                 contBlank++;   

               }    
            }
        }
        if(contBlank>1){
        incorrectAmount=0;
        
        }
        return incorrectAmount;

}
    
      public int checkGreen( int[][] matrix){
       int incorrectAmount=1;     
       int contGreen=0;
        for(int j=matrix.length-1;j>-1;j--){
            for(int i=matrix[j].length-1;i>-1;i--){
               if(matrix[j][i]==1){
                 contGreen++;   

               }    
            }
        }
        if(contGreen>4){
        incorrectAmount=0;
        
        }
        return incorrectAmount;

}
    public int checkYellow( int[][] matrix){
       int incorrectAmount=1;     
       int contYellow=0;
        for(int j=matrix.length-1;j>-1;j--){
            for(int i=matrix[j].length-1;i>-1;i--){
               if(matrix[j][i]==2){
                 contYellow++;   

               }    
            }
        }
        if(contYellow>4){
        incorrectAmount=0;
        
        }
        return incorrectAmount;

}
    
     public int checkRed( int[][] matrix){
        int incorrectAmount=1;     
       int contRed=0;
        for(int j=matrix.length-1;j>-1;j--){
            for(int i=matrix[j].length-1;i>-1;i--){
               if(matrix[j][i]==3){
                 contRed++;   

               }    
            }
        }
        if(contRed>4){
        incorrectAmount=0;
        
        }
        return incorrectAmount;

}
    
     public int checkBlue( int[][] matrix){
       int incorrectAmount=1;     
       int contBlue=0;
        for(int j=matrix.length-1;j>-1;j--){
            for(int i=matrix[j].length-1;i>-1;i--){
               if(matrix[j][i]==4){
                 contBlue++;   

               }    
            }
        }
        if(contBlue>4){
        incorrectAmount=0;
        
        }
        return incorrectAmount;

    }
     
    
    
}
