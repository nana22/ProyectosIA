
package Model;

import java.util.ArrayList;

public class Algorithm {
    public ArrayList<Tower> open = new ArrayList<Tower>();
    public ArrayList<Tower> closed = new ArrayList<Tower>();

    public ArrayList<Tower> getOpen() {
        return open;
    }

    public void setOpen(ArrayList<Tower> open) {
        this.open = open;
    }

    public ArrayList<Tower> getClosed() {
        return closed;
    }

    public void setClosed(ArrayList<Tower> closed) {
        this.closed = closed;
    }
    public boolean CheckOpen(int[][]matrix){//Revisa si la matriz se encuentra en abiertos
        for(int i=0;i<open.size();i++){
            if(open.get(i).matrix.equals(matrix)){
                return true;
            }
        }
        return false;    
    }
    
    public boolean CheckOClosed(int[][]matrix){//Revisa si la matriz se encuentra en abiertos
        for(int i=0;i<closed.size();i++){
            if(closed.get(i).matrix.equals(matrix)){
                return true;
            }
        }
        return false;    
    }

    
}
