/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Irigoyen Villafan
 * @version 1.0
 * 
 */
public class ProbadorInterfaces extends JFrame implements ActionListener{
    JButton btn1, btn2, btn3, btn4, btn5;    
    
    public ProbadorInterfaces() {
        super("Hola");
        setResizable(true);
        setBounds(300,300,600,400);
        
        setLayout(null);
        
        btn1 = new JButton ("Press me");
        btn2 = new JButton ("Squeeze me");
        btn3 = new JButton ("Hello mate");
        btn4 = new JButton ("Whats up");
        btn5 = new JButton ();
        
        btn1.setBounds(50, 50, 120, 30);
        btn2.setBounds(50, 100, 120, 30);
        btn3.setBounds(50, 150, 120, 30);
        btn4.setBounds(50, 200, 120, 30);  
        btn5.setBounds(50, 250, 120, 30);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        
        EscuchadorDeAccion ea = new EscuchadorDeAccion();
        btn1.addActionListener(ea);
        
        //EscuchadorDeAccion ea = new EscuchadorDeAccion();
        btn2.addActionListener(new EscuchadorDeAccion()); //Si se quiere emplear la linea 44 debemos poner ea
        
        btn3.addActionListener(this);
        
        btn4.addActionListener(new Achichincle());
        
        /*
        Achichincle ac = new Achichincle();
        btn4.addActionListener(ac);
        */
        
        btn5.addActionListener(
                new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                JOptionPane.showMessageDialog(null, "Hola soy el pana Miguel", "Saludo", JOptionPane.INFORMATION_MESSAGE);
            }
                    
                }
        );
        
        setVisible(true);
    }//Fin del constructor
   
    
    public static void main(String arg[]){
        new ProbadorInterfaces();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        JOptionPane.showMessageDialog(null, "Hola soy yo misma", "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
    


public class Achichincle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            JOptionPane.showMessageDialog(null, "Hola soy el achichincle", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }    
}
