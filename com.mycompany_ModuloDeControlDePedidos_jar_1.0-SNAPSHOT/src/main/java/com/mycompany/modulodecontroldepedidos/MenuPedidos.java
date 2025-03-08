/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulodecontroldepedidos;

/**
 *
 * @author luisi
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class MenuPedidos extends JFrame {
    private Usuario usuario;
    private JButton btnPestana;

    public MenuPedidos(Usuario usuario) {
        this.usuario = usuario;
        setTitle("Menú de Pedidos - " + usuario.getArea());
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton btnMostrar = new JButton("Mostrar Artículos");
        JButton btnEstatus = new JButton("Notificar Estatus");

        btnMostrar.addActionListener(e -> {
            MostrarArticulosPedidos ventana = new MostrarArticulosPedidos(usuario);
            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ventana.setVisible(true);
        });
        add(btnMostrar);

        btnEstatus.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Tu pedido sigue en proceso o ha sido completado, revisa con el administrador");
        });
        add(btnEstatus);

        if (usuario.isAdmin()) {
            btnPestana = new JButton("Pestaña Admin");
            btnPestana.addActionListener(e -> {
                PestanaAdmin admin = new PestanaAdmin();
                admin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                admin.setVisible(true);
            });
            add(btnPestana);
        }
    }
}
