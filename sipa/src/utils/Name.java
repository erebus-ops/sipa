/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class Name {
   private String nombrePila;
   private String primerApellido;
   private String segundoApellido;
   private String alias;
   
   //Constructor
   public Name(String nombrePila, String primerApellido, String segundoApellido, String alias){
       //Operador de ámbito this
       this.nombrePila = nombrePila;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.alias = alias;
   }

    public String getNombrePila() {
        return nombrePila;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getAlias() {
        return alias;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
   
}
