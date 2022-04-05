import java.awt.*;
<<<<<<< HEAD



=======
>>>>>>> de017fcdc9cd5b9842b611aafb19de97b5461f7f

public class Circulo extends Figure {
    private Point center;
    private double raio;

    public Circulo(Point center, double raio){
        this.center=center;
        this.raio=raio;
    }

    public void expand (double Scalefactor){
        raio = raio * Scalefactor;
    }


    @Override
    public double Area() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * raio;
    }
}
