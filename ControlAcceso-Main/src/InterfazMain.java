import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class InterfazMain extends JFrame {
    private List<Usuario>usuarios;

    public InterfazMain(List<Usuario> usuarios) {
        this.usuarios = usuarios;

        // Configuración de la ventana
        setTitle("Interfaz Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Botones para los módulos
        JButton botonUsuarios = new JButton("Administración de Usuarios");
        botonUsuarios.setBounds(50, 30, 300, 30);
        panel.add(botonUsuarios);

        JButton botonArticulos = new JButton("Administración de Artículos");
        botonArticulos.setBounds(50, 80, 300, 30);
        panel.add(botonArticulos);

        JButton botonInventario = new JButton("Inventario");
        botonInventario.setBounds(50, 130, 300, 30);
        panel.add(botonInventario);

        JButton botonSolicitudes = new JButton("Solicitud de Artículos");
        botonSolicitudes.setBounds(50, 180, 300, 30);
        panel.add(botonSolicitudes);

        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(50, 230, 300, 30);
        panel.add(botonSalir);

        // Acciones de los botones
        botonUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Accediendo a la interfaz de Administración de Usuarios...");
                // Aquí podrías conectar la interfaz de administración de usuarios en el futuro
            }
        });

        botonArticulos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Accediendo a Administración de Artículos...");
            }
        });

        botonInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Accediendo a Inventario...");
            }
        });

        botonSolicitudes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Accediendo a Solicitud de Artículos...");
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                System.exit(0);
            }
        });

        // Agregar panel a la ventana
        add(panel);
    }
}
