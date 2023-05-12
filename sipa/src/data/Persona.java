/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import utils.Name;
import java.util.Calendar;

/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class Persona {
    private Name nombre;
    private Calendar fechaNacimiento;
    private int edad;
        
    public Persona(Name nombre, Calendar fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Name getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(Name nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
