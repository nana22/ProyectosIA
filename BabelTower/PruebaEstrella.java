/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaestrella;

import java.util.ArrayList;

/**
 *
 * @author kelly
 */
public class PruebaEstrella {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] entrada = {{-1,5,5,5},{4,2,3,4},{1,2,4,3},{1,1,2,3},{2,1,4,3}};
     //  int[][] salida ={{-1,5,5,5},{3,4,4,2},{3,1,2,4},{1,2,3,1},{3,2,1,4}};
     int[][] salida ={{-1,5,5,5},{1,2,3,4},{3,2,4,4},{1,1,2,3},{2,1,4,3}};
//  int[][] salida ={{-1,5,5,5},{1,2,4,3},{4,2,3,4},{1,1,2,3},{2,1,4,3}};    
//  int[][] salida ={{-1,5,5,5},{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
    
     // int[][] salida ={{-1,5,5,5},{1,2,4,3},{1,2,4,3},{1,2,4,3},{1,2,4,3}};
      
      // int[][] salida ={{-1,5,5,5},{4,1,1,2},{2,2,1,1},{3,4,2,4},{4,3,3,3}};
        AEstrella aEstrella =new AEstrella();
        Tower nodo = aEstrella.A_Estrella(entrada,salida);
        if(nodo!=null){
        ArrayList<Tower> lista = new ArrayList<Tower>();
        Tower nodoAux = nodo;
        //lista.add(0,nodo.getMatrix());
        while(nodoAux!=null)
        {
            lista.add(0,nodoAux);
            nodoAux = nodoAux.getPadre();
        }
        System.out.println("Camino encontrado");
        for(int i=0;i<lista.size();i++)
        {
            lista.get(i).printMatrix();
            System.out.println();
        }
        }
        else
            System.out.println("No se encontro camino");
    }
    
}
