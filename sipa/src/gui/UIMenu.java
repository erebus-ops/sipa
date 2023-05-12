/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class UIMenu{
    JFrame ventana;
    JMenuBar jmb;
    JMenu jmAlumnos;
    JMenu jmAsistencias;
    JMenu jmParticipaciones;
    JMenu jmReportes;
    JMenu jmAyuda;
    JMenuItem jmiNuevo;
    JMenuItem jmiCargarArchivos;
    JMenuItem jmiSalir;
    JMenuItem jmiGrupo1;
    JMenuItem jmiGrupo2;
    JMenuItem jmiGrupo3;
    JMenuItem jmiNuevoGrupo;
    JMenuItem jmiAcercaDe;
    
    public UIMenu(){
        ventana = new JFrame ("Sistema de Información de Asistencias y Participaciones");
        ventana.setResizable(true);
        ventana.setBounds(300, 300, 600, 300); 
        
        jmb = new JMenuBar();
        
        jmAlumnos = new JMenu ("Alumnos");
        jmAsistencias = new JMenu ("Asistencias");
        jmParticipaciones = new JMenu ("Participaciones");
        jmReportes = new JMenu ("Reportes");
        jmAyuda = new JMenu ("Ayuda");
        /*
        jmiCargarArchivos.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                JFileChooser selector = new JFileChooser();
                FileNameExtensionFilter ef = new FileNameExtensionFilter("Arcivos Excel", "xlsx", "xls");
                    selector.setFileFilter(ef);
                    int s = selector.showOpenDialog(null);
                    if (s == JFileChooser.APPROVE_OPTION){
                        File f = selector.getSelectedFile();
                    }//Fin if
            }
        }
                
        );//Fin jmiCargarArchivos ActionListener
        */
        jmiNuevo = new JMenuItem ("Nuevo...");
        jmiCargarArchivos = new JMenuItem ("Cargar archivos...");
        jmiSalir = new JMenuItem ("Salir");        
        jmiGrupo1 = new JMenuItem("Grupo 2291...");
        jmiGrupo2 = new JMenuItem("Grupo 2491...");
        jmiGrupo3 = new JMenuItem("Grupo 2696...");
        jmiNuevoGrupo = new JMenuItem("Agregar Nuevo Grupo");
        jmiAcercaDe = new JMenuItem("Acerca de...");
        
        jmAsistencias.add(jmiGrupo1);
        jmAsistencias.add(jmiGrupo2);
        jmAsistencias.add(jmiGrupo3);
        jmAsistencias.addSeparator();
        jmAsistencias.add(jmiNuevoGrupo);
        
        jmAlumnos.add(jmiNuevo);
        jmAlumnos.add(jmiCargarArchivos);
        jmAlumnos.addSeparator();
        jmAlumnos.add(jmiSalir);
        
        jmAyuda.add(jmiAcercaDe);
        
        jmiAcercaDe.addActionListener(
                new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                JOptionPane.showMessageDialog(ventana, "Sistema de Información de Participaciones y Asistencias 1.0", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
            }
                }
        );//Fin jmiAcercaDe ActionListener
        
        
        jmb.add(jmAlumnos);
        jmb.add(jmAsistencias);
        jmb.add(jmParticipaciones);
        jmb.add(jmReportes);
        jmb.add(jmAyuda);
        
        ventana.setJMenuBar(jmb);
        ventana.setVisible(true);
    }
    
    public static void main (String args[]){
        new UIMenu();
        }    
}
