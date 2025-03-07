import javax.swing.*;
import java.util.Map;

public class GraficaArticulos extends JFrame {
    public GraficaArticulos(Map<String, Integer> solicitudes) {
        setTitle("Gráfica de Artículos Más Solicitados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear un gráfico de barras
        GraficaBarras grafico = new GraficaBarras(solicitudes);
        add(grafico);
    }
}