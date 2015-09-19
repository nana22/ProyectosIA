
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Txt {

    
    public String Read(File file) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        String line;
        while((line = reader.readLine())!= null){
            builder.append(line);
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }
    public void Write(String text){
        File file = new File("BabelTower.txt"); /*Crea un archivo de texto, es donde se almacena el resultado*/
        PrintWriter writer;
        try {
            writer = new PrintWriter(file);
            writer.print(text); /*Escribe lo que quiero scanear*/
            writer.close();
        } catch (Exception e) {
        }
    }

}
