/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulodecontroldepedidos;

/**
 *
 * @author luisi
 */
import java.util.ArrayList;

public class Pedido {
     private ArrayList<Articulos> articulosDePedido;
    private Usuario usuario;
    private boolean completado;

    public Pedido(ArrayList<Articulos> articulos, Usuario usuario) {
        this.articulosDePedido = articulos;
        this.usuario = usuario;
        this.completado = false;
    }

    public ArrayList<Articulos> getArticulosDePedido() {
        return articulosDePedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
