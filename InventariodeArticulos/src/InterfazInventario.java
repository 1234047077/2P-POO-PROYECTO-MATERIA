import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazInventario extends JFrame {
    private Inventario gestorInventario;
    private JTable tablaArticulos;

    public InterfazInventario() {
        gestorInventario = new Inventario();
        setTitle("Sistema de Inventario - Merks and Spen");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Configuración de colores
        Color colorFondo = new Color(240, 240, 240);
        Color colorBoton = new Color(0, 102, 204);
        Color colorTextoBoton = Color.WHITE;
        Color colorBorde = new Color(200, 200, 200);

        // Panel superior con título de la empresa
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(0, 51, 102));
        JLabel titulo = new JLabel("Merks and Spen - Inventario de Artículos");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.WHITE);
        panelTitulo.add(titulo);

        // Panel superior con botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBorder(new TitledBorder("Acciones"));
        panelBotones.setBackground(colorFondo);
        JButton btnConsultar = new JButton("Consultar Artículos");
        JButton btnGraficas = new JButton("Ver Gráficas");
        JButton btnReporte = new JButton("Generar Reporte PDF");

        // Personalización de botones
        btnConsultar.setBackground(colorBoton);
        btnConsultar.setForeground(colorTextoBoton);
        btnGraficas.setBackground(colorBoton);
        btnGraficas.setForeground(colorTextoBoton);
        btnReporte.setBackground(colorBoton);
        btnReporte.setForeground(colorTextoBoton);

        panelBotones.add(btnConsultar);
        panelBotones.add(btnGraficas);
        panelBotones.add(btnReporte);

        // Panel central con la tabla de artículos
        JPanel panelTabla = new JPanel(new BorderLayout());
        panelTabla.setBorder(new TitledBorder("Artículos en Inventario"));
        panelTabla.setBackground(colorFondo);
        tablaArticulos = new JTable();
        tablaArticulos.setBackground(Color.WHITE);
        tablaArticulos.setGridColor(colorBorde);
        JScrollPane scrollPane = new JScrollPane(tablaArticulos);
        panelTabla.add(scrollPane, BorderLayout.CENTER);

        // Acción para el botón de consultar
        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Nombre");
                model.addColumn("Cantidad");
                model.addColumn("Solicitudes");

                for (Articulo articulo : gestorInventario.getArticulos()) {
                    model.addRow(new Object[]{articulo.getNombre(), articulo.getCantidad(), articulo.getSolicitudes()});
                }

                tablaArticulos.setModel(model);
            }
        });

        // Acción para el botón de gráficas
        btnGraficas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GraficaArticulos(gestorInventario.getSolicitudesPorArticulo()).setVisible(true);
            }
        });

        // Acción para el botón de generar reporte
        btnReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestorInventario.generarReportePDF();
                JOptionPane.showMessageDialog(null, "Reporte generado exitosamente");
            }
        });

        // Agregar paneles a la ventana principal
        add(panelTitulo, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(panelTabla, BorderLayout.SOUTH);
    }
}
