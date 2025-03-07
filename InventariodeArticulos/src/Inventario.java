import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {
    private List<Articulo> articulos;

    public Inventario() {
        articulos = new ArrayList<>();
        // Ejemplo de datos iniciales
        articulos.add(new Articulo("Silla ergonomica", 10, 15));
        articulos.add(new Articulo("Escritorio de madera", 5, 20));
        articulos.add(new Articulo("Base para laptop", 8, 10));
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public Map<String, Integer> getSolicitudesPorArticulo() {
        Map<String, Integer> solicitudes = new HashMap<>();
        for (Articulo articulo : articulos) {
            solicitudes.put(articulo.getNombre(), articulo.getSolicitudes());
        }
        return solicitudes;
    }

    public void generarReportePDF() {
        // Lógica para generar reporte en PDF
        System.out.println("Reporte generado en PDF");
    }
}

