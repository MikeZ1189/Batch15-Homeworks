package Project2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    Circle (double radius){
        this.radius=radius;
    }
    public void calculateArea(){
        double area = 3.14* this.radius * this.radius;
        System.out.println("Area of circle = "+area);
    }
    public void calculatePerimeter(){
        double perimeter = 2 * 3.14 * this.radius;
        System.out.println("Perimeter of circle = "+perimeter);
    }
}
class Square implements Shape{
    double side;
    Square (double side){
        this.side =side;
    }
    public void calculateArea(){
        double area = side*side;
        System.out.println("Area of square = "+area);
    }
    public void calculatePerimeter(){
        double perimeter = 4*side;
        System.out.println("Perimeter of square = "+perimeter);
    }
}
class ShapeTester {
    public static void main(String[] args) {
        Circle c=new Circle(2.50);
        c.calculateArea();
        c.calculatePerimeter();

        Square s=new Square(2.5);
        s.calculateArea();
        s.calculatePerimeter();
    }
}