/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.Model;

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
    }
}
