import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Módulo de Administración de Usuarios");
        frame.setSize(600, 500); // Aumentamos el tamaño para la nueva sección
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(173, 216, 230));
        frame.add(mainPanel);


        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(100, 149, 237));
        JLabel titleLabel = new JLabel("Administración de Usuarios", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(new Color(173, 216, 230)); // Azul claro
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Margen interno


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;


        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Nombre:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField nameField = new JTextField(20);
        centerPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(new JLabel("Departamento:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextField departmentField = new JTextField(20);
        centerPanel.add(departmentField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(new JLabel("Contraseña:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JPasswordField passwordField = new JPasswordField(20);
        centerPanel.add(passwordField, gbc);


        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton addButton = new JButton("Dar de Alta");
        centerPanel.add(addButton, gbc);


        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("ID de Usuario a Eliminar:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JTextField deleteField = new JTextField(20);
        centerPanel.add(deleteField, gbc);


        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        JButton deleteButton = new JButton("Dar de Baja");
        centerPanel.add(deleteButton, gbc);


        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("ID de Usuario a Modificar:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        JTextField modifyIdField = new JTextField(20);
        centerPanel.add(modifyIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        centerPanel.add(new JLabel("Nueva Contraseña:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        JPasswordField newPasswordField = new JPasswordField(20);
        centerPanel.add(newPasswordField, gbc);


        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        JButton modifyButton = new JButton("Modificar Usuario");
        centerPanel.add(modifyButton, gbc);


        mainPanel.add(centerPanel, BorderLayout.CENTER);


        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new GridBagLayout());
        searchPanel.setBackground(new Color(173, 216, 230));
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));


        GridBagConstraints gbcSearch = new GridBagConstraints();
        gbcSearch.insets = new Insets(5, 5, 5, 5);
        gbcSearch.fill = GridBagConstraints.HORIZONTAL;


        gbcSearch.gridx = 0;
        gbcSearch.gridy = 0;
        searchPanel.add(new JLabel("Buscar Usuario:"), gbcSearch);

        gbcSearch.gridx = 1;
        gbcSearch.gridy = 0;
        JTextField searchField = new JTextField(20);
        searchPanel.add(searchField, gbcSearch);


        gbcSearch.gridx = 2;
        gbcSearch.gridy = 0;
        JButton searchButton = new JButton("Buscar");
        searchPanel.add(searchButton, gbcSearch);


        gbcSearch.gridx = 0;
        gbcSearch.gridy = 1;
        gbcSearch.gridwidth = 3;
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        resultArea.setBackground(new Color(200, 220, 240));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        searchPanel.add(scrollPane, gbcSearch);


        mainPanel.add(searchPanel, BorderLayout.SOUTH);


        frame.setVisible(true);
    }
}