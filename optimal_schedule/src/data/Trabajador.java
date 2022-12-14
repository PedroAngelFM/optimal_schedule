/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class Trabajador implements Serializable {
    String identification;
    float horasTrabajadasAnio;
    float horasTrabajadasMes;
    float tipoContrato;
    int findesTrabajados; 
    boolean isUltimoTurnoNoche;

    //Constructor de trabajador vacío, no se ha realizado ninguna jornada
    public Trabajador()
    {
        this.identification=" ";
        this.horasTrabajadasAnio=0;
        this.horasTrabajadasMes=0;
        this.tipoContrato=(float) 1.0;
        
        
    }
    
    

    public Trabajador(String identification, float horasTrabajadasAnio, float horasTrabajadasMes, int findesTrabajados, boolean isUltimoTurnoNoche) {
        this.identification = identification;
        this.horasTrabajadasAnio = horasTrabajadasAnio;
        this.horasTrabajadasMes = horasTrabajadasMes;
        this.findesTrabajados = findesTrabajados;
        this.isUltimoTurnoNoche = isUltimoTurnoNoche;
    }
    
    

    
    
}
