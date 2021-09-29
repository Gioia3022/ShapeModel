import java.awt.*;
import java.util.Scanner;

class Triangle extends Shape {
    //private variables declaration
    float x1,x2, y1,y2, z1,z2, side1, side2, side3;

    //constructor
    public Triangle(float x1, float x2, float y1, float y2, float z1, float z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    private void sides() {
        this.side1= Math.abs((float) Math.sqrt((this.y1-this.x1)*(this.y1-this.x1)+(this.y2-this.x2)*(this.y2-this.x2)));
        this.side2= Math.abs((float) Math.sqrt((this.z1-this.y1)*(this.z1-this.y1)+(this.z2-this.y2)*(this.z2-this.y2)));
        this.side3= Math.abs((float) Math.sqrt((this.z1-this.x1)*(this.z1-this.x1)+(this.z2-this.x2)*(this.z2-this.x2)));
    }

    //finds the center of the triangle
    Point getCenter(){
        Point p= new Point();
        float moyX= (x1+y1+z1)/3;
        float moyY= (x2+y2+z2)/3;
        p.setLocation(moyX,moyY);
        return p;
    }

    //asks the coordinates to the user
    void askSize(){
        System.out.println("What are the coordinates of the first point? ");
        Scanner in= new Scanner(System.in);
        this.x1 = in.nextFloat();
        this.x2= in.nextFloat();

        System.out.println("What are the coordinates of the second point? ");
        this.y1 = in.nextFloat();
        this.y2 = in.nextFloat();

        System.out.println("What are the coordinates of the third point? ");
        this.z1 = in.nextFloat();
        this.z2 = in.nextFloat();
    }

    //calculates and displays the area
    float Area() {
        float area=0;
        sides();
        if(((this.side1+this.side2)>this.side3) && ((this.side1+this.side3)> this.side2)&& ((this.side2+this.side3)>this.side1))
        {
            float s=(this.side1+this.side2+this.side3)/2;
            area= (float) Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        }
        System.out.println("The area of the triangle is: "+ area + " cm^2");
        return area;
    }



    //display center
    void Center() {
        float moyX= (x1+y1+z1)/3;
        float moyY= (x2+y2+z2)/3;
        System.out.println("The center of the triangle is: \nx:"+ moyX + " , y: "+ moyY);
    }

    //calculates and displays the circumference
    float Circumfernce() {
        sides();
        float circumference=this.side1+this.side2+this.side3;
        System.out.println("The circumference of the triangle is: "+ circumference+ " cm");
        return circumference;
    }

    //verifies if the point is in the triangle
    boolean WherePoint(float pointX, float pointY){
        double ABC = Math.abs (this.x1 * (this.y2 - this.z2) + this.y1 * (this.z2 - this.x1) + this.z1 * (this.x2 - this.y2));
        double ABP = Math.abs (this.x1 * (this.y2 - pointY) + this.y1 * (pointY - this.x2) + pointX * (this.x2 - this.y2));
        double APC = Math.abs (this.x1 * (pointY - this.z2) + pointX * (this.z2 - this.x2) + this.z1 * (this.x2 - pointY));
        double PBC = Math.abs (pointX * (this.y2 - this.z2) + this.y1 * (this.z2 - pointY) + this.z1 * (pointY - this.y2));
        if( ABP + APC + PBC == ABC)
        {
            System.out.println("This point is in the triangle");
            return true;
        }
        else
        {
            System.out.println("This point is not in the triangle");
            return false;
        }
    }
    
    //allows to move the shape on a 2D surface
    void Move(float f, float g){
        this.x1+= f;
        this.y1+= f;
        this.z1+= f;
        this.x2+= g;
        this.y2+= g;
        this.z2+= g;
        System.out.println("the coordinates of the triangle are now: \nx1: "+ this.x1 +"   x2: "+ this.y1+"   x3:" + this.z1 +" \ny1: "+ this.x2+"   y2: "+ this.y2 + "   y3: "+ this.z2);
    }
}