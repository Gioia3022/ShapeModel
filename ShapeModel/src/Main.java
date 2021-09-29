/* Gioia Mariasole Galiazzo
 * Shape Model
 * Part 1 of the portfolio
 */

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables declaration
        Shape r, r1, c, c1, t, t1;
        String i= "yes", q;
        float x = 0, y=0, rad=0, a, b, rad1=0;
        float x1=0, x2=0, y1=0, y2=0, z1=0, z2=0;
        float a1=0, a2=0, b1=0, b2=0, d1=0, d2=0;

        //InputStream
        Scanner in = new Scanner(System.in);

        //The while loop to allow us to create more than 1 shape without exiting
       while(Objects.equals(i, "yes")) {
            System.out.println("What do you want to draw? ");
            String s = in.next();

            //using a switch to avoid making 3 if loops
            switch (s) {
                case "rectangle":
                    //creation of r instance of the rectangle class
                    r = new Rectangle(x,y);
                    //calling functions
                    r.askSize();
                    r.Area();
                    r.Center();
                    r.Circumfernce();

                    System.out.println("What is your coordinates for your point?\nx: ");
                    a = in.nextFloat();
                    System.out.println("y: ");
                    b = in.nextFloat();
                    //verifies if a point is inside the rectangle
                    r.WherePoint(a, b);

                    System.out.println("Create a new rectangle to measure the distance between the 2 centers ");
                    r1 = new Rectangle(x, y); //creating a new object
                    r1.askSize();
                    //measures euclidean distance between centers of 2 shapes
                    r.Euclidean(r1);

                    System.out.println("Do you want to move your first rectangle?" );
                    q=in.next();
                    if(Objects.equals(q, "yes")) {
                        System.out.println("Of how much do you want to move your rectangle?\nx: ");
                        float f  = in.nextFloat();
                        System.out.println("y: ");
                        float g  = in.nextFloat();
                        //Bonus function to move around the shape on a 2D surface
                        r.Move(f, g);
                    }
                    break;

                case "circle":
                    //creation of c instance of the circle class
                    c = new Circle(rad);
                    //calling functions
                    c.askSize();
                    c.Area();
                    c.Center();
                    c.Circumfernce();

                    System.out.println("What is your coordinates for your point?\nx: ");
                    a = in.nextFloat();
                    System.out.println("y: ");
                    b = in.nextFloat();
                    //verifies if a point is inside the circle
                    c.WherePoint(a, b);

                    System.out.println("Create a new circle to measure the distance between the 2 centers ");
                    c1 = new Circle(rad1); //creating a new object
                    c1.askSize();
                    //measures euclidean distance between centers of 2 shapes
                    c.Euclidean(c1);

                    System.out.println("Do you want to move your first circle?" );
                    q=in.next();
                    if(Objects.equals(q, "yes")) {
                        System.out.println("Of how much do you want to move your circle?\nx: ");
                        float f  = in.nextFloat();
                        //Bonus function to move around the shape on a 2D surface
                        c.Move(f, 0);
                    }
                    break;
                case "triangle":
                    //creation of t instance of the triangle class
                    t = new Triangle(x1, x2, y1, y2, z1, z2);
                    //calling functions
                    t.askSize();
                    t.Area();
                    t.Center();
                    t.Circumfernce();

                    System.out.println("What is your coordinates for your point?\nx: ");
                    a = in.nextFloat();
                    System.out.println("y: ");
                    b = in.nextFloat();
                    //verifies if a point is inside the triangle
                    t.WherePoint(a, b);

                    System.out.println("Create a new triangle to measure the distance between the 2 centers ");
                    t1 = new Triangle(a1, a2, b1, b2, d1, d2); //creating a new object
                    t1.askSize();
                    //measures euclidean distance between centers of 2 shapes
                    t.Euclidean(t1);

                    System.out.println("Do you want to move your first triangle?" );
                    q=in.next();
                    if(Objects.equals(q, "yes")) {
                        System.out.println("Of how much do you want to move your triangle?\nx: ");
                        float f  = in.nextFloat();
                        System.out.println("y: ");
                        float g  = in.nextFloat();
                        //Bonus function to move around the shape on a 2D surface
                        t.Move(f, g);
                    }
                    break;
            }
            //if anything else than a yes is inserted the program will end
            System.out.println("\nDo you want to draw an other shape? ");
            i = in.next();
        }
    }
}

