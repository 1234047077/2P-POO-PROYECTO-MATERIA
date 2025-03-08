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

public class MostrarArticulosPedidos extends JFrame {
    private Usuario usuario;
    private JCheckBox[] checkBoxes;
    private JSpinner[] spinners;
    private String[] nombresArticulos = {"Lapices", "Hojas", "Bolígrafos", "Carpetas", "Marcadores"};

    public MostrarArticulosPedidos(Usuario usuario) {
        this.usuario = usuario;
        setTitle("Mostrar Artículos");
        setSize(300, 300);
        setLayout(new GridLayout(nombresArticulos.length + 1, 3));

        checkBoxes = new JCheckBox[nombresArticulos.length];
        spinners = new JSpinner[nombresArticulos.length];

        for (int i = 0; i < nombresArticulos.length; i++) {
            checkBoxes[i] = new JCheckBox(nombresArticulos[i]);
            spinners[i] = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
            add(checkBoxes[i]);
            add(spinners[i]);
            add(new JLabel("unid."));
        }

        JButton btn = new JButton("Realizar Pedido");
        btn.addActionListener(e -> {
            ArrayList<Articulos> articulosSeleccionados = new ArrayList<>();
            for (int i = 0; i < nombresArticulos.length; i++) {
                if (checkBoxes[i].isSelected()) {
                    int cant = (int) spinners[i].getValue();
                    articulosSeleccionados.add(new Articulos(nombresArticulos[i], cant));
                }
            }
            if (!articulosSeleccionados.isEmpty()) {
                Pedido p = new Pedido(articulosSeleccionados, usuario);
                DataStore.pedidos.add(p);
                JOptionPane.showMessageDialog(this, "Pedido creado para " + usuario.getArea());
            } else {
                JOptionPane.showMessageDialog(this, "No se seleccionó ningún artículo");
            }
        });
        add(btn);
    }
}