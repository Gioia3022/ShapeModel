import java.awt.*;
import java.util.Scanner;

class Circle extends Shape {
    //private variable declaration
    float radius, c=0;

    //constructor
    public Circle(float radius) {
        this.radius=radius;
    }

    //finds the center of the circle
    Point getCenter(){
        Point p= new Point();
        p.setLocation(this.radius,this.radius);
        return p;
    }

    //asks the coordinates to the user
    void askSize(){
        System.out.println("What is the radius? ");
        Scanner in= new Scanner(System.in);
        this.radius = in.nextFloat();
    }

    //calculates and displays the area
    float Area(){
        float area= (float) (this.radius*this.radius*Math.PI);
        System.out.println("The area of the circle is: "+ area+ " cm^2");
        return area;
    }

    //display center
    void Center() {
        this.c= this.radius;
        System.out.println("The center of the circle is: \nx: "+ this.c+ ", y: "+ this.c);
    }

    //calculates and displays the circumference
    float Circumfernce() {
        float circumference= (float) (2*Math.PI*this.radius);
        System.out.println("The circumference of the circle is: "+ circumference+ " cm");
        return circumference;
    }

    //verifies if the point is in the circle
    boolean WherePoint(float pointX, float pointY){
        if( pointX >= 0 && pointX <= this.radius && pointY >=0 && pointY <= this.radius )
        {
            System.out.println("This point is in the circle");
            return true;
        }
        else
        {
            System.out.println("This point is not in the circle");
            return false;
        }
    }

    //allows to move the shape on a 2D surface
    void Move(float f, float g){
        this.c= f+this.radius;
        System.out.println("the center of the circle is now:" + this.c +" and the radius is still: " +this.radius);
    }
}