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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
    
    public void loadPlantilla()
    {
                try {
            Path p = Rutas.pathToFileInFolderOnDesktop("Asprodes", "plantilla.bin");
            FileInputStream fis = new FileInputStream(p.toFile());
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            plantilla= (List<Trabajador>) ois.readObject();
            ois.close();
            
           } catch (Exception ex) {
                   
            }
    
    }
    
    public void savePlantilla()
    {
    
        File f=Rutas.fileToFileInFolderOnDesktop("Asprodes","plantilla.bin");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this.plantilla);
            oos.close();
        } catch (Exception ex) {
            
        }
     
    }
    
    public boolean isPlantillaVacia()
    {
        return plantilla.isEmpty();
    }
    
}
