import java.awt.*;

//abstract class that allows other classes to access its methods
abstract class Shape {
    abstract void askSize();
    abstract Point getCenter();
    abstract float Area();
    abstract void Center();
    abstract float Circumfernce();
    abstract boolean WherePoint(float x, float y);

    /* all extensions of "Shape" use the same methode to calculate the euclidean distance so we write down
     * the function directly here
     */
    void Euclidean(Shape otherShape){
        Point center1 = this.getCenter();
        Point center2 = otherShape.getCenter();

        float d = (float) Math.sqrt((center2.getX() - center1.getX()) * (center2.getX() - center1.getX()));
        System.out.println("The euclidean distance between these two shapes is : " + d + "\n");
    }
    /* This function is a bonus method
     * it allows us to move the shape wherever we want in a 2D interface
     */
    abstract void Move(float f, float g);
}