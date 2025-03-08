import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class InterfazLogin extends JFrame{
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private List<Usuario> usuarios;

    public InterfazLogin(List<Usuario> usuarios) {
        this.usuarios = usuarios;

        // Configuración de la ventana
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Etiqueta y campo de texto para el usuario
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(10, 20, 80, 25);
        panel.add(etiquetaUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(100, 20, 165, 25);
        panel.add(campoUsuario);

        // Etiqueta y campo de texto para la contraseña
        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        etiquetaContraseña.setBounds(10, 50, 80, 25);
        panel.add(etiquetaContraseña);

        campoContrasena = new JPasswordField();
        campoContrasena.setBounds(100, 50, 165, 25);
        panel.add(campoContrasena);

        // Botón de login
        JButton botonLogin = new JButton("Login");
        botonLogin.setBounds(100, 90, 80, 25);
        panel.add(botonLogin);

        // Acción del botón de login
        botonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contraseña = new String(campoContrasena.getPassword());

                if (usuario.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.");
                } else if (ControlAcceso.autenticar(usuario, contraseña, usuarios)) {
                    JOptionPane.showMessageDialog(null, "¡Bienvenido, " + usuario + "!");
                    dispose(); // Cerrar la ventana de login
                    new InterfazMain(usuarios).setVisible(true); // Abrir la interfaz principal
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });

        // Agregar panel a la ventana
        add(panel);
    }
}
