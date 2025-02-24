package tareaCodernada;
import java.lang.Math;
public class Punto {
    public float x;
    public float y;
    
    public Punto(float x,float y){
        this.x=x;
        this.y=y;
    }
    public String coord_cartesianas(){
        return "("+this.x+","+this.y+")";
    }
    public void coord_polares(){
        float r=(float) Math.sqrt((x*x)+(y*y));
        float v=y/x;
        float a=(float) Math.atan(v);
        System.out.println("Radio: "+r+" Angulo: "+a);
    }
    public String toString(){
        return "Punto"+coord_cartesianas();
    }
}
