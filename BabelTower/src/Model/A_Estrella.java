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
 //Estado inicial
    private int inicial[][];
    //Estado final
    private int estFinal[][];
    //Nodo actual
    private Tower nodoActual;
    
    //Pila de abiertos
    private ArrayList listaAbierta;
    //Lista de cerrados
    private ArrayList listaCerrados;
    
    private Movements movimientos = new  Movements();
    
    //Camino mas corto A*
    public Tower A_Estrella( int[][] Minicial,int[][] Mfinal )
    {
        //inicializo variables
        this.inicial = Minicial;
        this.estFinal = Mfinal;
        boolean caminoEncontrado=false;
        nodoActual=new Tower();
        nodoActual.setMatrix(Minicial);
        listaAbierta = new ArrayList<Tower>();
        listaCerrados = new ArrayList<Tower>();
        listaAbierta.add(nodoActual);
        
        //Mientras existan nodos en pila de abiertos
        while(!listaAbierta.isEmpty())
        {
            //Pop de la pila
            nodoActual = (Tower) listaAbierta.get(0);
            this.listaAbierta.remove(0);
            //Verifico si nodo actual corresponde con estado final
            caminoEncontrado = CompararEstados(nodoActual);
            //si no corresponde
            if(!caminoEncontrado)
            {
                //Asigno el nodo actual a cerrados
                listaCerrados.add(nodoActual);
                //Genero sucesores para nodo actual
                GenerarSucesores();
                
            }//si no, termina while
            else
                break;
            
        }
        //si encontro camino, retorne nodo actual
        if(caminoEncontrado)
            return nodoActual;        
        //retorne null
        return null;
    }
    //Copia una matriz en otra
    public int[][] CopiarMatriz(int[][] original)
    {
        int [][] copia=new int[5][4];
        for(int i =0;i<5;i++)
            for(int j=0;j<4;j++)
                copia[i][j]=original[i][j];
        return copia;
    }

    //Compara la matriz del estado actual con el estado final definido
    public boolean CompararEstados(Tower estadoActual)
    {
        int[][] matrix=estadoActual.getMatrix();
        boolean isCorrect = true;
        for(int i=1;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                if(matrix[i][j]!=estFinal[i][j])
                {
                    isCorrect=false;
                }
                    
            }
        }
        return isCorrect;
    }
       
     ///Genera los sucesores del nodo actual
    public void GenerarSucesores()
    {
        //Lista temporal de sucesores generados
        ArrayList<Tower> nodosAdyacentes = new ArrayList<Tower>();
        //variable que registra el indice de la lista
        int indice=0;
        //Realizar movimientos permitidos por cada fila
        for(int i=0;i<nodoActual.getMatrix().length-1;i++)
        {
            indice=0;
            //Mover fila a la izquierda
            Tower adyacente= new  Tower();
            adyacente.setMatrix(movimientos.MoveToLeftRow(i,CopiarMatriz(nodoActual.getMatrix())));
            //Verifica que adyacente generado no se encuentre en lista de adyacentes
             indice=Contiene(nodosAdyacentes,adyacente);
             if(indice==-1)//si no existe lo adjunta
             {
                adyacente.setPadre(nodoActual);
                adyacente.setCost(1);            
                adyacente.setG(nodoActual.getG()+adyacente.getCost());
                adyacente.setH(H(adyacente.getMatrix()));            
                nodosAdyacentes.add(adyacente);
             }
             //Mover fila derecha
            Tower adyacenteL=new  Tower();
            adyacenteL.setMatrix(movimientos.MoveToRightRow(i,CopiarMatriz(nodoActual.getMatrix())));
            //Verifica que adyacente generado no se encuentre en lista de adyacentes
            indice=Contiene(nodosAdyacentes,adyacenteL);
             if(indice==-1)//si no, lo adjunta
             {
                adyacenteL.setPadre(nodoActual);
                adyacenteL.setCost(1);            
                adyacenteL.setG(nodoActual.getG()+adyacenteL.getCost());
                adyacenteL.setH(H(adyacenteL.getMatrix()));            
                nodosAdyacentes.add(adyacenteL);
             }
        }
        //Mover hacia abajo
        int[][] matrizD = movimientos.MoveDown(CopiarMatriz(nodoActual.getMatrix()));
        if(matrizD!=null)//si es permitido el movimiento
        {
            Tower adyacenteU=new  Tower();
            adyacenteU.setMatrix(matrizD);
            //Verifica que adyacente generado no se encuentre en lista de adyacentes
            indice=Contiene(nodosAdyacentes,adyacenteU);
                 if(indice==-1)//si no, lo adjunta
                 {
                    adyacenteU.setPadre(nodoActual);
                    adyacenteU.setCost(1);            
                    adyacenteU.setG(nodoActual.getG()+adyacenteU.getCost());
                    adyacenteU.setH(H(adyacenteU.getMatrix()));            
                    nodosAdyacentes.add(adyacenteU);
                 }
        }
        //Mover hacia arriba
        int[][] matrizU = movimientos.MoveUp(CopiarMatriz(nodoActual.getMatrix()));
        if(matrizU!=null)//si es permitido el movimiento
        {
            Tower adyacenteD=new  Tower();
            adyacenteD.setMatrix(matrizU);
            //Verifica que adyacente generado no se encuentre en lista de adyacentes
            indice=Contiene(nodosAdyacentes,adyacenteD);
             if(indice==-1)//si no, lo adjunta
             {
        
                adyacenteD.setPadre(nodoActual);
                adyacenteD.setCost(1);                           
                adyacenteD.setG(nodoActual.getG()+adyacenteD.getCost());
                adyacenteD.setH(H(adyacenteD.getMatrix()));
                nodosAdyacentes.add(adyacenteD);
             }
        }
        //recorre listaAdyacentes para verificar que no exista en abiertos ni cerrados
        for(int j=0;j<nodosAdyacentes.size();j++)
        {
            //indice de lista cerrados que contiene misma matriz que nodo de adyacentes
            int indiceCerrados =Contiene(this.listaCerrados,(Tower)nodosAdyacentes.get(j));
            //indice de pila abiertos que contiene misma matriz que nodo de adyacentes
            int indiceAbiertos =Contiene(this.listaAbierta,(Tower)nodosAdyacentes.get(j));
            
            if(indiceCerrados==-1)   //si no esta en cerrados         
                {
                    if(indiceAbiertos!=-1)//si existe en abiertos
                    {
                        //Compara peso de camino recorrido
                        if(((Tower)nodosAdyacentes.get(j)).getG()<((Tower)listaAbierta.get(indiceAbiertos)).getG())
                        {   
                            //si el adyacente tiene menor peso que el de abiertos, se elimina el de abiertos
                            listaAbierta.remove(indiceAbiertos);
                        }
                        else //si no, se elimina el adyacente
                        {
                            nodosAdyacentes.remove(j);
                        }
                    }
                }
            else // si esta en cerrados se elimina el adyacente
            {
                nodosAdyacentes.remove(j);
            }
        }//si existen nodos adyacentes
        if(nodosAdyacentes.size()>0)
        {
            //agrego nodos adyacentes
            this.listaAbierta.addAll(0,nodosAdyacentes);
            //reordeno listaAbierta
            Collections.sort(listaAbierta,Tower.TowerFComparator);
        }
    }    
    //Calcula el valor heuristico de costo futuro
    //Realiza una sumatoria del valor absoluto de las diferencias entre cada celda que se encuentre 
    //equivocada y el espacio vacio. Como es un aproximado se multiplica dicho valor
    //por un valor arbitrario 3
    //este es el principio del algoritmo Manhattan (adaptado para multiples caminos)
    public int H(int[][] actual)
    {
        int heuristico=0;
        for(int i=0;i<actual.length-1;i++)
            for(int j=0;j<actual[i].length-1;j++)
                if(actual[i][j]!=estFinal[i][j])
                {
                    int fila=getRowBlankSpace(actual);
                    int columna = getColumnBlankSpace(actual);
                    heuristico += (Math.abs(fila-i)+Math.abs(columna-j))*3;
                }
                    
        return heuristico;
    }
    ///Verifica si una lista de nodos contiene un nodo específico,
    /// realiza la comparacion por matriz
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
