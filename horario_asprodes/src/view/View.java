/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;

/**
 *
 * @author pedro
 */
public class View {
    Controller c=new Controller();
    
    public void inicioPrograma()
    {
        System.out.printf("\nBienvenido al programa de creación de horarios \n");
        c.inicioPrograma();
    }
    
    public void runMenu() {
        System.out.printf("No está implementado aún");
    }

}
