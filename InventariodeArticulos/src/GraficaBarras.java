import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class GraficaBarras extends JPanel {
    private Map<String, Integer> solicitudes;

    public GraficaBarras(Map<String, Integer> solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int barWidth = 50;
        int x = 50;
        int yBase = getHeight() - 50;

        for (Map.Entry<String, Integer> entry : solicitudes.entrySet()) {
            int barHeight = entry.getValue() * 10;
            g.setColor(new Color(0, 102, 204));
            g.fillRect(x, yBase - barHeight, barWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(entry.getKey(), x, yBase + 20);
            x += barWidth + 20;
        }
    }
}

