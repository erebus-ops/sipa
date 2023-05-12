/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Calendar;
import utils.Name;

/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class Profesor extends Persona {
    private String numeroTrabajador;
    
    public Profesor(String numeroTrabajador, Name nombre, Calendar fechaNacimiento){
        super(nombre, fechaNacimiento);
        this.numeroTrabajador = numeroTrabajador;
    }
}
