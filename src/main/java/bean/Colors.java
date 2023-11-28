package bean;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
    transient private Color color;
    private boolean rectangular;

    public Colors() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();
    }

    public boolean isRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean rectangular) {
        this.rectangular = rectangular;
        repaint();
    }

    private void change() {
        color = randomColor();
        repaint();
    }

    private Color randomColor() {
        int r = (int) (255 * Math.random());
        int g = (int) (255 * Math.random());
        int b = (int) (255 * Math.random());
        return new Color(r, g, b);
    }

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);
        if (rectangular) g.fillRect(0, 0, w - 1, h - 1);
        else g.fillOval(0, 0, w - 1, h - 1);
    }

    public static void main(String[] args) {
        Colors c = new Colors();
        Color color1 = c.randomColor();
        System.out.println(color1);
    }
}
