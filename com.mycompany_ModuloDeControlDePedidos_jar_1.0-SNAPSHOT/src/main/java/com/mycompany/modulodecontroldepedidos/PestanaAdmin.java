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

public class PestanaAdmin extends JFrame {
    private DefaultListModel<Pedido> modeloLista;
    private JList<Pedido> listaPedidos;
    private JButton btnCompletar;
    private JButton btnEliminar;

    public PestanaAdmin() {
        setTitle("Pestaña Admin");
        setSize(500, 300);
        setLayout(new BorderLayout());
        modeloLista = new DefaultListModel<>();
        for (Pedido p : DataStore.pedidos) {
            modeloLista.addElement(p);
        }
        listaPedidos = new JList<>(modeloLista);
        listaPedidos.setCellRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Pedido) {
                    Pedido pedido = (Pedido) value;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Área: ").append(pedido.getUsuario().getArea());
                    sb.append(" | Usuario: ").append(pedido.getUsuario().getNombre());
                    sb.append(" | Artículos: ");
                    ArrayList<Articulos> arts = pedido.getArticulosDePedido();
                    for (int i = 0; i < arts.size(); i++) {
                        sb.append(arts.get(i).getNombre()).append("(").append(arts.get(i).getCantidad()).append(")");
                        if (i < arts.size() - 1) sb.append(", ");
                    }
                    sb.append(" | Completado: ").append(pedido.isCompletado());
                    setText(sb.toString());
                }
                return this;
            }
        });
        add(new JScrollPane(listaPedidos), BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        btnCompletar = new JButton("Marcar Completado");
        btnEliminar = new JButton("Eliminar Pedido");
        btnCompletar.addActionListener(e -> marcarCompletado());
        btnEliminar.addActionListener(e -> eliminarPedido());
        panelBotones.add(btnCompletar);
        panelBotones.add(btnEliminar);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void marcarCompletado() {
        Pedido p = listaPedidos.getSelectedValue();
        if (p != null) {
            p.setCompletado(true);
            StringBuilder sb = new StringBuilder("Pedido del área ");
            sb.append(p.getUsuario().getArea());
            sb.append(" con artículos: ");
            for (int i = 0; i < p.getArticulosDePedido().size(); i++) {
                sb.append(p.getArticulosDePedido().get(i).getNombre()).append("(");
                sb.append(p.getArticulosDePedido().get(i).getCantidad()).append(")");
                if (i < p.getArticulosDePedido().size() - 1) sb.append(", ");
            }
            sb.append(" fue completado.");
            JOptionPane.showMessageDialog(this, sb.toString());
            listaPedidos.repaint();
        }
    }

    private void eliminarPedido() {
        Pedido p = listaPedidos.getSelectedValue();
        if (p != null) {
            DataStore.pedidos.remove(p);
            modeloLista.removeElement(p);
        }
    }
}

