/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class AbrirArchivo extends JFrame{
    JButton btnAbrir, btnGuardarBD;
    JTable tabla;
    DefaultTableModel modelo;
    File archivo;
    FileReader fr;
    BufferedReader br;
    JFileChooser selector;
    JScrollPane sp;
    
    public AbrirArchivo(){
        setBounds(50,50,700,500);
        setLayout(null);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Carrera");
        modelo.addColumn("Num. Cuenta");
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Nombre(s)");
        
        tabla = new JTable(modelo);
        sp = new JScrollPane(tabla);
        tabla.setBounds(100,100,500,300);
        sp.setBounds(20,110,650,300);
        add(sp);
        
        btnAbrir = new JButton("Abrir Archivo");
        btnAbrir.setBounds(200,30,150,30);
        add(btnAbrir);
        
        btnGuardarBD = new JButton ("Guardar archivo");
                btnGuardarBD.setBounds(350,30,150,30);
                add(btnGuardarBD);
                btnGuardarBD.setVisible(false);
                selector = new JFileChooser(System.getProperty("darkf.dir"));
                selector.setFileFilter(new FileNameExtensionFilter("Archivos de alumnos: ","csv", "xlsx", "xls"));
                
btnAbrir.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cargarArchivo();
            }
        }

);
setVisible(true);
    }//Fin del constructor
    
public void cargarArchivo(){
    try{
        String texto = "";
        selector.showOpenDialog(tabla);
        archivo = selector.getSelectedFile();
        Object[] o = new Object[5];
        if(archivo != null){
            tabla.getModel();
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            while((texto = br.readLine())!= null){
                String registro[] = texto.split(",");
                o[0] = registro[0];
                o[1] = registro[1];
                o[2] = registro[2];
                o[3] = registro[3];
                o[4] = registro[4];
                modelo.addRow(o);
            }//Termina while
            tabla.setModel(modelo);
            br.close();
            fr.close();
        }//Termina if
    }catch(Exception ex){
        
    }//
}//Fin del método de cargar archivo
    
    public static void main(String arg[]){
        new AbrirArchivo();
    }
    
}
