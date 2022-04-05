import java.awt.*;

public class Retangulo extends Figure {

    private Point upperLeft;
    private Point bottomRight;

    public Retangulo(Point upperLeft, Point bottomRight){
        this.upperLeft=upperLeft;
        this.bottomRight=bottomRight;
    }

    @Override
    public double Area() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
    }

    @Override
    public double perimeter() {
        return 2 * (bottomRight.x - upperLeft.x) + (upperLeft.y - bottomRight.y);
    }
}
