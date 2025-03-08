import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Administración de Artículos");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(255, 200, 200));
        frame.add(mainPanel);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(200, 50, 50));
        JLabel titleLabel = new JLabel("Administración de Artículos", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(new Color(255, 200, 200));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Nombre del Artículo:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField nombreField = new JTextField(20);
        centerPanel.add(nombreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(new JLabel("Cantidad:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextField cantidadField = new JTextField(20);
        centerPanel.add(cantidadField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(new JLabel("Descripción:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JTextField descripcionField = new JTextField(20);
        centerPanel.add(descripcionField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton altaButton = new JButton("Dar de Alta");
        centerPanel.add(altaButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("Nombre del Artículo a Eliminar:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JTextField bajaField = new JTextField(20);
        centerPanel.add(bajaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        JButton bajaButton = new JButton("Dar de Baja");
        centerPanel.add(bajaButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("Nombre del Artículo a Modificar:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        JTextField modificarNombreField = new JTextField(20);
        centerPanel.add(modificarNombreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        centerPanel.add(new JLabel("Nueva Cantidad:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        JTextField modificarCantidadField = new JTextField(20);
        centerPanel.add(modificarCantidadField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        centerPanel.add(new JLabel("Nueva Descripción:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        JTextField modificarDescripcionField = new JTextField(20);
        centerPanel.add(modificarDescripcionField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        JButton modificarButton = new JButton("Modificar Artículo");
        centerPanel.add(modificarButton, gbc);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new GridBagLayout());
        searchPanel.setBackground(new Color(255, 200, 200));
        searchPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        GridBagConstraints gbcSearch = new GridBagConstraints();
        gbcSearch.insets = new Insets(5, 5, 5, 5);
        gbcSearch.fill = GridBagConstraints.HORIZONTAL;

        gbcSearch.gridx = 0;
        gbcSearch.gridy = 0;
        searchPanel.add(new JLabel("Buscar Artículo:"), gbcSearch);

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
        resultArea.setBackground(new Color(255, 220, 220));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        searchPanel.add(scrollPane, gbcSearch);

        mainPanel.add(searchPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}