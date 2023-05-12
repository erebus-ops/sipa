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
public class Alumno extends Persona{
    private String numeroCuenta;
    
    //Constructor
    public Alumno(String numeroCuenta, Name nombre, Calendar fechaNacimiento){
        super(nombre, fechaNacimiento);
        this.numeroCuenta = numeroCuenta;
    }
}
