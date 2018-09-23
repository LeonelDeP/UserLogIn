package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PLogic {
    
    ArrayList lista;
    File archivo;
    static final String SEPARATOR = ";";
    static final String QUOTE = "\"";
    
    public PLogic(){
        lista = new ArrayList();
    }
    
    public void cargarArchivo(String ruta){
        archivo = new File(ruta);
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(SEPARATOR);
                System.out.println(Arrays.toString(fields));
            }
            br.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
