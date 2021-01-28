package geometry;

public class Circle  extends Shape{

    private int radius;
    private Point position;
    private Color fill;

    public Circle(Point position, int radius) {
        this.radius = radius;
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return (2 * radius) * Math.PI;
    }

    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

}
