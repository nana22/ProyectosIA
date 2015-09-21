package Model;
import Model.Tower;
import java.util.ArrayList;
import java.util.Collections;
import Model.Movements;
/**
 *
 * @author kelly
 */
public class A_Estrella {

       
      
    private int inicial[][];
    
    private int estFinal[][];
    
    private Tower nodoActual;
    
    private Movements movimientos = new  Movements();
    private ArrayList listaAbierta;
    
    private ArrayList listaCerrados;
    
    public Tower A_Estrella( int[][] Minicial,int[][] Mfinal )
    {
        this.inicial = Minicial;
        this.estFinal = Mfinal;
        boolean caminoEncontrado=false;
        nodoActual=new Tower();
        nodoActual.setMatrix(Minicial);
        listaAbierta = new ArrayList<Tower>();
        listaCerrados = new ArrayList<Tower>();
        listaAbierta.add(nodoActual);
        int iteraciones=0;
        
        
        while(!listaAbierta.isEmpty())
        {
            nodoActual = (Tower) listaAbierta.get(0);
            this.listaAbierta.remove(0);
            caminoEncontrado = CompararEstados(nodoActual);
//            System.out.println("Nodo Actual:");
//            nodoActual.printMatrix();            
//            System.out.print("F:");
//            System.out.println(nodoActual.getF());
//        
//            System.out.print("Diff:");
//            System.out.println(nodoActual.getDiffer());
            
            if(!caminoEncontrado)
            {
                iteraciones++;
                listaCerrados.add(nodoActual);
                GenerarSucesores(iteraciones);
                
            }
            else
                break;
            
        }
        if(caminoEncontrado)
            return nodoActual;        
        return null;
    }
    
    public int[][] CopiarMatriz(int[][] original)
    {
        int [][] copia=new int[5][4];
        for(int i =0;i<5;i++)
            for(int j=0;j<4;j++)
                copia[i][j]=original[i][j];
        return copia;
    }

    
    public boolean CompararEstados(Tower estadoActual)
    {
        int[][] matrix=estadoActual.getMatrix();
        int diferencia =0;
       boolean isCorrect = true;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                if(matrix[i][j]!=estFinal[i][j])
                {
                    diferencia++;
                    isCorrect=false;
                }
                    
            }
        }
        estadoActual.setDiff(diferencia);
        return isCorrect;
    }
    
    public void GenerarSucesores(int iteraciones)
    {
        ArrayList<Tower> nodosAdyacentes = new ArrayList<Tower>();
        for(int i=0;i<nodoActual.getMatrix().length-1;i++)
        {
            
            Tower adyacente= new  Tower();
            adyacente.setPadre(nodoActual);
            adyacente.setCost(1);
            adyacente.setMatrix(movimientos.MoveToLeftRow(i,CopiarMatriz(nodoActual.getMatrix())));
            CompararEstados(adyacente);
            adyacente.setG(nodoActual.getG()+adyacente.getCost());
            adyacente.setH(adyacente.getDiffer());            
            
           nodosAdyacentes.add(adyacente);
            
            
            Tower adyacenteL=new  Tower();
            adyacenteL.setPadre(nodoActual);
            adyacenteL.setCost(1);
            adyacenteL.setMatrix(movimientos.MoveToRightRow(i,CopiarMatriz(nodoActual.getMatrix())));
            CompararEstados(adyacenteL);
            adyacenteL.setG(nodoActual.getG()+adyacenteL.getCost());
            adyacenteL.setH(adyacenteL.getDiffer());            
            nodosAdyacentes.add(adyacenteL);
        }
        
        Tower adyacenteU=new  Tower();
            adyacenteU.setPadre(nodoActual);
            adyacenteU.setCost(1);
            adyacenteU.setMatrix(movimientos.MoveDown(CopiarMatriz(nodoActual.getMatrix())));
            CompararEstados(adyacenteU);
            adyacenteU.setG(nodoActual.getG()+adyacenteU.getCost());
            adyacenteU.setH(adyacenteU.getDiffer());            
            nodosAdyacentes.add(adyacenteU);
        
            Tower adyacenteD=new  Tower();
            adyacenteD.setPadre(nodoActual);
            adyacenteD.setCost(1);
            adyacenteD.setMatrix(movimientos.MoveUp(CopiarMatriz(nodoActual.getMatrix())));
            CompararEstados(adyacenteD);
            adyacenteD.setG(nodoActual.getG()+adyacenteD.getCost());
            adyacenteD.setH(adyacenteD.getDiffer());
            nodosAdyacentes.add(adyacenteD);
        
        
        for(int j=0;j<nodosAdyacentes.size();j++)
        {
            int indiceCerrados =Contiene(this.listaCerrados,(Tower)nodosAdyacentes.get(j));
            int indiceAbiertos =Contiene(this.listaAbierta,(Tower)nodosAdyacentes.get(j));
            if(indiceCerrados==-1)            
                {
                    if(indiceAbiertos!=-1)
                    {
                        if(((Tower)listaAbierta.get(indiceAbiertos)).getF()>=((Tower)nodosAdyacentes.get(j)).getF())
                        {
                            listaAbierta.remove(indiceAbiertos);
                        }
                        else
                        {
                            nodosAdyacentes.remove(j);
                        }
                    }
                }
            else
            {
                nodosAdyacentes.remove(j);
            }
        }
        if(nodosAdyacentes.size()>0){
//           System.out.println("Lista Adyacente:");
//            for(int i=0;i<nodosAdyacentes.size();i++)
//            {
//                System.out.print("indice: ");
//                System.out.println(i);
//                ((Tower)nodosAdyacentes.get(i)).printMatrix();
//                
//            }
        Collections.sort(nodosAdyacentes,Tower.TowerFComparator);
        this.listaAbierta.addAll(0,nodosAdyacentes);
        }
    }    
    
    public int Contiene(ArrayList<Tower> listado,Tower nodo)
    {
        int resultado=-1;
        for(int i=0; i<listado.size();i++)
        {
            if(((Tower)listado.get(i)).equals(nodo))
                resultado=i;
        }
        return resultado;
    } 
        
}
