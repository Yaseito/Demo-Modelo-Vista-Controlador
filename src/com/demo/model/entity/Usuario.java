/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model.entity;

/**
 *
 * @author Hijos
 */
public class Usuario {
    
    private long Id;
    private String Email;
    private String Clave;
    private String Apellidos;
    private String Nombres;
    private int Tipo;
    
    public Usuario(){
        
    }

    public Usuario(long Id, String Email, String Clave, String Apellidos, String Nombres, int Tipo) {
        this.Id = Id;
        this.Email = Email;
        this.Clave = Clave;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Tipo = Tipo;
    }

    public Usuario(String Email, String Clave) {
        this.Email = Email;
        this.Clave = Clave;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
