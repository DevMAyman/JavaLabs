package Shapes;
import Shapes.Shape;

public class Rectangle extends Shape {
    public float length;
    public float width;
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    @Override
    public float calculateArea(){
        System.out.println("It is Rectangle Area");
        return (float)(length*width) ;
    }
}
