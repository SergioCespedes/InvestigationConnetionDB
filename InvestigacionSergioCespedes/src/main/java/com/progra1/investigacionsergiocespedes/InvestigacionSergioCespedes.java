/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.progra1.investigacionsergiocespedes;

import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class InvestigacionSergioCespedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String User = JOptionPane.showInputDialog("Digite su Usuario");
        String Password = JOptionPane.showInputDialog("Digite su Contraseña");;
        
        Conexion_DB Connection = new Conexion_DB();
        Connection.ConnectionDB(User,Password);
    }
    
}
