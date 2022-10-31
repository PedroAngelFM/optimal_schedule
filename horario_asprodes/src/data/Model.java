/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.util.List;
import com.coti.tools.Rutas;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class Model {
    List<Trabajador> plantilla=new ArrayList<>();
    List<Turno> listaTurnos=new ArrayList<>() ;

    public Model() {
    }
    
    public boolean loadPlantilla()
    {
                try {
            Path p = Rutas.pathToFileInFolderOnDesktop("IMDB21", "actores.bin");
            FileInputStream fis = new FileInputStream(p.toFile());
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            plantilla= (List<Trabajador>) ois.readObject();
            ois.close();
            return true;
           } catch (Exception ex) {
                 return false;   
            }
    
    }
    
    
}
