/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulodecontroldepedidos;

/**
 *
 * @author luisi
 */
public class Usuario {
private String nombre;
    private boolean admin;
    private String area;

    public Usuario(String nombre, boolean admin, String area) {
        this.nombre = nombre;
        this.admin = admin;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getArea() {
        return area;
    }
}
