/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.Model;
import com.coti.tools.Esdia;
/**
 *
 * @author pedro
 */
public class Controller {
    
    Model m=new Model ();

    public Controller() {
    }
    
    public void inicioPrograma()
    {
        m.loadPlantilla();
        if(m.isPlantillaVacia())
        {
            System.out.printf("\n La lectura de los binarios no se ha podido realizar \n");
           int i= Esdia.readInt("\n Qué desea realizar ?:"
                              + "\n 1.-Importar un archivo"
                              + "\n 2.-Crear Trabajador \n"
                              + "=>");
            switch(i)
            {
                case 1:
                {
                    boolean respuesta;
                    respuesta=Esdia.siOno("\n¿Tiene alguna carpeta específica en la que guarda el archivo?\n");
                    if(respuesta){
                        
                    }
                    else
                    {
                        System.out.printf("Se cargarán los archivos desde la carpeta ASPRODES que tenga en el escritorio");
                    }
                }
                default:
                {
                    System.out.printf("\n No se ha introducido una opción válida,\n"
                                     + " se procede a importar el archivo por defecto\n"
                                     + " puede que quede la lista vacía, pero puede crear nuevos ejemplares de trabajadores \"a mano\"");
                }
            
            }
        }
    }
}
