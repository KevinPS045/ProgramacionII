package Practica5;
import java.util.Scanner;

public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public void mostrarRaices() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.println("Las raices son: " + getRaiz1() + " y " + getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("La raiz unica es: " + getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);

        ecuacion.mostrarRaices();
    }
}