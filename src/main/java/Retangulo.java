import java.awt.*;

public class Retangulo extends Figure {

    private Point upperLeft;
    private Point bottomRight;

    public Retangulo(Point upperLeft, Point bottomRight){
        this.upperLeft=upperLeft;
        this.bottomRight=bottomRight;
    }

    @Override
<<<<<<< HEAD
    public double Area() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
=======
    public float Area() {
        return (float)Math.sqrt(Math.pow((bottomRight.x-upperLeft.x),2) + Math.pow((bottomRight.y-upperLeft.y), 2));
>>>>>>> de017fcdc9cd5b9842b611aafb19de97b5461f7f
    }

    @Override
    public double perimeter() {
        return 2 * (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
    }
}
