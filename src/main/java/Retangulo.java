import java.awt.*;

public class Retangulo extends Figure {

    private Point upperLeft;
    private Point bottomRight;

    public Retangulo(Point upperLeft, Point bottomRight){
        this.upperLeft=upperLeft;
        this.bottomRight=bottomRight;
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
