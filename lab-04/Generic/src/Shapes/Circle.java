package Shapes;
import Shapes.Shape;
public class Circle extends Shape {
    float radius;
    public Circle(float radius){
        this.radius=radius;
    }
    @Override
    public float calculateArea(){
        System.out.println("It is circle Area");
        return (float)(Math.PI*Math.pow(radius,2)) ;
    }
}
