import java.awt.*;
<<<<<<< HEAD

public class Circulo {
    private double raio;
    private Point centro;
=======
>>>>>>> ca2e3e63e811adeba769ee41b7926dc956c87d64

public class Circulo extends Figure {
    private Point center;
    private double raio;

    public Circulo(Point center, double raio){
        this.center=center;
        this.raio=raio;
    }

    public void expand (double Scalefactor){
        this.
    }


    @Override
    public float Area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
