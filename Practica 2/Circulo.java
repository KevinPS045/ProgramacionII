package tareaCodernada;
import javax.swing.*;
import java.awt.*;
public class Circulo {
    Punto centro;
    double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }

    public void dibujaCirculo(Graphics g) {
        g.drawOval((int) (centro.x * 50 - radio * 50), (int) (centro.y * 50 - radio * 50), 
                   (int) (radio * 100), (int) (radio * 100));
    }
}
