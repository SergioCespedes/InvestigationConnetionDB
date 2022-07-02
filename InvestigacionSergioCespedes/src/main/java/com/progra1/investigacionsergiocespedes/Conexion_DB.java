/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.progra1.investigacionsergiocespedes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sergi
 */
public class Conexion_DB {

    private static Connection con = null;
    private static final String DB = "Investigacion_BD";
    private static final String Ip = "localhost";
    private static final String Port = "3306";

    String Cadena = "jdbc:mysql://" + Ip + ":" + Port + "/" + DB;

    public Connection ConnectionDB(String User, String Password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(Cadena, User, Password);
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
            System.out.println("Conectado a la Base de Datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos, Error:" + e.toString());
            System.out.println("No se conecto  a  la  Base  de  Datos, Error: " + e.toString());
        }
        return con;
    }

    public String Consult(Connection Con) {
        String res = "";
        
        return res;
    }
}
