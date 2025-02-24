package tareaCodernada;
import javax.swing.*;
import java.awt.*;
class Grafica extends JPanel {
    Linea linea;
    Circulo circulo;

    public Grafica(Linea linea, Circulo circulo) {
        this.linea = linea;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujaLinea(g);
        circulo.dibujaCirculo(g);
    }
}

public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gráfica");
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        Linea linea = new Linea(p1, p2);

        Punto centro = new Punto(3, 3);
        Circulo circulo = new Circulo(centro, 2);

        System.out.println(linea);
        System.out.println(circulo);

        Grafica panel = new Grafica(linea, circulo);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
