package Practica5;
import java.util.Scanner;

public class Estadisticas {
    private double[] numeros;

    public Estadisticas(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double promedio = promedio();
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Estadisticas estadisticas = new Estadisticas(numeros);

        System.out.println("El promedio es: " + estadisticas.promedio());
        System.out.println("La desviacion estándar es: " + estadisticas.desviacion());
    }
}