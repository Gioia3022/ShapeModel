import java.util.Scanner;
import java.awt.*;

class Rectangle extends Shape {
    //private variables declaration
    float x1, x2=0, y1, y2=0, cX, cY;

    //constructor
    public Rectangle(float x1, float y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    //finds the center of the triangle
    Point getCenter(){
        Point p= new Point();
        this.cX = this.x1 / 2;
        this.cY = this.y1 / 2;
        p.setLocation(cX,cY);
        return p;
    }

    //asks the coordinates to the user
    void askSize(){
        System.out.println("What is your width? ");
        Scanner in= new Scanner(System.in);
        this.x1 = in.nextFloat();
        System.out.println("What is your height? ");
        this.y1 = in.nextFloat();
    }

    //calculates and displays the area
    float Area() {
        float area = this.x1 * this.y1;
        System.out.println("The area of the rectangle is: "+ area+ " cm^2");
        return area;
    }

    //display center
    void Center() {
        this.cX = this.x1 / 2;
        this.cY = this.y1 / 2;
        System.out.println("The center of the rectangle is: \nx: "+ cX+ ", y: "+ cY);
    }

    //calculates and displays the circumference
    float Circumfernce() {
        float circumference= this.x1*2 +this.y1*2;
        System.out.println("The circumference of the rectangle is: "+ circumference+ " cm");
        return circumference;
    }

    //verifies if the point is in the triangle
    boolean WherePoint(float pointX, float pointY){
        if( pointX >= 0 && pointX <= this.x1 && pointY >=0 && pointY <= this.y1 )
        {
            System.out.println("This point is in the rectangle");
            return true;
        }
        else
        {
            System.out.println("This point is not in the rectangle");
            return false;
        }
    }
    //allows to move the shape on a 2D surface
    void Move(float f, float g){
        this.x2= f;
        this.x1+=f;
        this.y2= g;
        this.y1+=g;
        System.out.println("the coordinates of the rectangle are now: \nx1: "+ this.x2 +"   x2: "+ this.x1+"\ny1: "+ this.y2+"   y2: "+ this.y1);
    }
}

