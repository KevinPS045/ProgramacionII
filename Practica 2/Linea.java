package tareaCodernada;
import javax.swing.*;
import java.awt.*;
class Linea {
    Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea de " + p1 + " a " + p2;
    }

    public void dibujaLinea(Graphics g) {
        g.drawLine((int) p1.x * 50, (int) p1.y * 50, (int) p2.x * 50, (int) p2.y * 50);
    }
}
