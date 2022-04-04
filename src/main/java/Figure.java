import java.awt.*;

public abstract class Figure {

    private Color color;


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public abstract float  Area();



    public abstract double perimeter();

}
