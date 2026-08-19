import java.io.*;
abstract class Shape { 
    abstract void calculateArea() ; 
    abstract void calculatePerimeter() ; 
}
class Circle extends Shape {
    private double radius ; 
    public Circle (double radius) { 
        this.radius = radius ; 

    }
    @Override 
    void calculateArea () {
        double area = 3.14 * radius * radius ; 
        System.out.println(" Area of circle is " + area);

    }
    @Override 
    void calculatePerimeter() { 
        double perimeter = 2 * 3.14 * radius ; 
       System.out.println(" Perimeter of circle is  " + perimeter);

    }

}
class  Rectangle extends Shape { 
    private double length ; 
    private double breadth ; 
    public Rectangle (double length , double breadth ) {
    this.length = length ; 
    this.breadth = breadth ; 
    } 

    @Override 
   void calculateArea () { 
    double area = length*breadth ; 
    System.out.println(" Area of rectangle is " + area);


   }

   @Override
   void calculatePerimeter () { 
    double perimeter = 2*(length + breadth ) ; 
    System.out.println(" perimeter  of the rectangle is : " + perimeter);
   } 
}
class Triangle extends Shape { 
    private double base ; 
    private double height ; 
    private double side1;
    private  double side2;
    private double side3; 
    public Triangle (double base, double height, double side1 , double side2, double side3) {
      
     this.base = base; 
     this.height  = height; 
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3 ; 
}
   
@Override 
  void calculateArea() {
    double area = 0.5*base*height; 
    System.out.println("Area of the triangle is " + area); 
   
}
 
@Override 
  void calculatePerimeter() {
   double perimeter = side1 + side2 + side3; 
   System.out.println("Perimeter of the triangle is " + perimeter); 
  } 
} 

public class problem3 {
    public static void main ( String args[] )  throws IOException{
        Shape s[] = new Shape[3];
s[0] = new Circle(5.0);
s[1] = new Rectangle(4.0,6.0);
s[2] = new Triangle(4.0, 3.0, 3.0, 4.0, 5.0);
for (Shape hapes : s ) {
        hapes.calculateArea();
        hapes.calculatePerimeter();
            System.out.println();
        }
    }
}
    