/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia_Borja_Li
 */
public class Conexion {

    Connection con = null;

    //Método para realizar la conexión
    public Connection getConexion() {
        try {
            //Usar la base de datos mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Conexion con la ruta de la BD
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Usuario", "root", "patito_2010");
             JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Conexión fallida " + ex.getMessage());
        }
        return con;
    }

    //Método para ejecutar consultas
    public ResultSet consulta(String consulta) {
        ResultSet rs = null;
        try {
            //Consulta a la bd
            PreparedStatement ps = con.prepareStatement(consulta);
            //rs almacena el resultado de la consulta
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Conexión fallida " + ex.getMessage());
        }
        return rs;
    }

}
