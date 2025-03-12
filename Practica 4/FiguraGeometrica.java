package Polimorfismo;

public class FiguraGeometrica {

    double area(double radio, String Figura) {
        if (Figura.equalsIgnoreCase("circulo")) {
            return Math.PI * radio * radio;  
        }
        return 0;  
    }

    double area(double base, double altura) {
        return base * altura;  
    }

    // Triángulo
    double area(double base, double altura, String Figura) {
        if (Figura.equals("triangulo")) {
            return (base * altura) / 2;  
        } else {
            return base * altura;  
        }
    }

    double area(double B, double b, double h, String Figura) {
        if (Figura.equals("trapecio")) {
            return ((B + b) / 2) * h;  
        } else {
            return 0;
        }
    }

    double area(double L) {
        return (1.0 / 4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * L * L; 
    }

    public static void main(String[] args) {
        FiguraGeometrica circulo = new FiguraGeometrica();
        FiguraGeometrica rectangulo = new FiguraGeometrica();
        FiguraGeometrica trianguloRec = new FiguraGeometrica();
        FiguraGeometrica trapecio = new FiguraGeometrica();
        FiguraGeometrica pentagono = new FiguraGeometrica();

        System.out.println("Círculo: " + circulo.area(3, "circulo"));  
        System.out.println("Rectángulo: " + rectangulo.area(2, 3)); 
        System.out.println("Triángulo rectángulo: " + trianguloRec.area(2, 4, "triangulo"));  
        System.out.println("Trapecio: " + trapecio.area(5, 3, 2, "trapecio"));  
        System.out.println("Pentágono: " + pentagono.area(5));  
    }
}
