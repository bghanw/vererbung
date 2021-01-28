package geometry;

public class TextRectangle extends Rectangle{

    private String text;

    public TextRectangle( String text, Point topLeft, int width, int height) {
        super(topLeft,width,height);
        this.text = text;
        this.position = topLeft;
    }

    public String getText(){
        return text;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }
}
