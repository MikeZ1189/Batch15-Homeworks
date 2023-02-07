package HwClass20;
/*
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code
*/
public class Shape {

    Double area;
    double radius;
    Shape(Double radius){
        this.radius=radius;
    }
}
class Circle  extends Shape{
    Circle(Double radius) {
        super(radius);
    }
    void Area(){
        System.out.println("Area of circle is : "+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        Circle circle=new Circle(2.5);{
            circle.Area();
        }
    }
}


