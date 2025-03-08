/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulodecontroldepedidos;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author luisi
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Usuario usuario = new Usuario("Juan", true, "Almacen"); 
            
            MenuPedidos menu = new MenuPedidos(usuario);
            menu.setDefaultCloseOperation(MenuPedidos.EXIT_ON_CLOSE);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        });
    }
}
