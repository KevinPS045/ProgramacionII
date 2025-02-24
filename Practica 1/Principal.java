package tareaCodernada;
public class Principal {
    public static void main(String[] args) {
        Punto p=new Punto(3,4);
        System.out.println("cordenada cartesiana: "+p.toString());
        System.out.print("cordenadas polares: ");
        p.coord_polares();
    }
    
}
