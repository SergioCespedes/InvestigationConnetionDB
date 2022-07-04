/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.progra1.investigacionsergiocespedes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion_DB {

    private Connection con = null;
    private final String DB = "Investigacion_BD";
    private final String Ip = "localhost";
    private final String User = "root";
    private final String Password = "Programador2022";
    private final String Port = "3306";

    String Cadena = "jdbc:mysql://" + Ip + ":" + Port + "/" + DB;

    public Connection ConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(Cadena, User, Password);
            System.out.println("Conectado a la Base de Datos");
        } catch (Exception e) {
            System.out.println("No se conecto  a  la  Base  de  Datos, Error: " + e.toString());
        }
        return con;
    }

    //Metodo que consulta 
    public void Consult() {
        Connection connection = ConnectionDB();
        Statement statament;
        try {
            statament = connection.createStatement();
            ResultSet resultSet = statament.executeQuery("select id, nombre, primer_apellido, segundo_apellido, provincia, telefono from persona");
            while (resultSet.next()) {             
                System.out.println("Resultado de la consulta: \n ID: "+ resultSet.getString(1)+
                                   " Nombre: "+ resultSet.getString(2)+
                                   " Primer Apellido: " + resultSet.getString(3)+
                                   " Segundo Apellido: "+ resultSet.getString(4)+
                                   " Provincia:" + resultSet.getString(5)+
                                   " Telefono:" + resultSet.getString(6)+"\n");
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Hubo un problemna con la Base de Datos, Error: " + ex.toString());
        }
    }
}
