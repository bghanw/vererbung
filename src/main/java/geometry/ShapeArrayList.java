package geometry;

import java.util.ArrayList;

public class ShapeArrayList extends ArrayList<Shape> {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Circle circle) {
      shapes.add(circle);
    }

    public void add(Rectangle rectangle) {
        shapes.add(rectangle);
    }


    public int getAmountOfCircles(){
        int amountOfCircles = 0;
        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Circle){
                amountOfCircles++;

            }
        }
        return amountOfCircles;
    }

    public int getAmountOfRectangles(){
        int amountOfRectangles = 0;
        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Rectangle){
                amountOfRectangles++;

            }
        }
        return amountOfRectangles;
    }

    public ArrayList getAllCircles(){
        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Circle){
                circles.add((Circle) shapes.get(i));
            }
        }
        return circles;
    }

    public ArrayList getAllRectangles(){
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Rectangle){
                rectangles.add((Rectangle) shapes.get(i));
            }
        }
        return rectangles;
    }
}
