package Generic;
import Shapes.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shapes.Shape> ShapeList = new ArrayList<>();
        ShapeList.add(new Circle(5));
        ShapeList.add(new Circle(8));
        ShapeList.add(new Rectangle(10,6));
        ShapeList.add(new Circle(20));
        ShapeList.add(new Rectangle(20,9));
        ShapeList.forEach(myshape -> System.out.println(myshape.calculateArea()));

    }
}
