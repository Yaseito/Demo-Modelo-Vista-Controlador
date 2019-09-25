/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.controller.conexion.Conexion;
import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hijos
 */
public class ControllerLogin extends Controller {

    Conexion cn = new Conexion();
    Connection con = cn.getConexion();
    ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
    Usuario us = new Usuario();

    public ControllerLogin() {

    }

    public boolean logIn(String usuario, String clave) {
        boolean band = false;
        Usuario user = new Usuario(usuario, clave);
        band = ModeloUsuario.logIn(user);
        return band;
    }

    public void logUp(int id, String email, String clave, String apellidos, String nombres, int tipo) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into Usuario(id_Usuario, Email,\n"
                    + "Clave, Apellidos ,Nombres,Tipo) values\n"
                    + "(?,?,?,?,?,?);");

            ps.setInt(1, id);
            ps.setString(2, email);
            ps.setString(3, clave);
            ps.setString(4, apellidos);
            ps.setString(5, nombres);
            ps.setInt(6, tipo);

            agregarArray(id, email, clave, apellidos, nombres, tipo);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Correcto");
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        }
    }

    public void agregarArray(int id, String email, String clave, String apellidos, String nombres, int tipo) {
        us.setId(id);
        us.setEmail(email);
        us.getClave();
        us.getApellidos();
        us.getNombres();
        us.setTipo(tipo);

        Usuarios.add(us);
    }

    public void recuperarClave(String email, String clave) {
        try {
            PreparedStatement ps = con.prepareStatement("update Usuario set Email='" + email + "' , " + "Clave='" + clave + "';");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

}
