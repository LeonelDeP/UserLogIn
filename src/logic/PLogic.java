package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PLogic {
    
    ArrayList<Registro> lista;
    File archivo;
    static final String SEPARATOR = ",";
    static final String QUOTE = "\"";
    
    public PLogic(){
        lista = new ArrayList<>();
    }
    
    public void cargarArchivo(String ruta){
        archivo = new File(ruta);
        BufferedReader br = null;
        Registro nuevo;
        try{
            br = new BufferedReader(new FileReader(archivo));
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(SEPARATOR);
                nuevo = new Registro(fields[0], fields[1],fields [5], fields[2]);
                System.out.println(fields[0]);
                System.out.println(fields[1]);
                System.out.println(fields[5]);
                System.out.println(fields[2]);
                line = br.readLine();
            }
            br.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
