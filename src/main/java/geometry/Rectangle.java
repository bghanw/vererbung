package geometry;

public class Rectangle extends Shape{

    protected int width;
    protected int height;


    public Rectangle(Point topLeft, int width, int height) {
        this.position = topLeft;
        this.width = width;
        this.height = height;
    }

   // public  Rectangle (){}

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }

    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }
}
