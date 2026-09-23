/**
 * This class represents a simple picture of a flower. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Harpreet Kaur
 * @version 2026.09.22
 */
public class Picture
{
    private Triangle petal1;
    private Triangle petal2;
    private Triangle leaf;
    private Circle circle;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        petal1 = new Triangle();  
        petal2 = new Triangle(); 
        leaf = new Triangle(); 
        circle = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) { 
            leaf.changeColor("green");
            leaf.changeSize(60, 180);
            leaf.moveHorizontal(20);
            leaf.moveVertical(-60);
            leaf.makeVisible();
            
            petal1.changeColor("red");
            petal1.changeSize(60, 180);
            petal1.moveHorizontal(20);
            petal1.moveVertical(-60);
            petal1.makeVisible();
            
            petal2.changeColor("magenta");
            petal2.changeSize(60, 180);
            petal2.moveHorizontal(20);
            petal2.moveVertical(-60);
            petal2.makeVisible();
            
           
            circle.changeColor("yellow");
            circle.moveHorizontal(100);
            circle.moveVertical(-40);
            circle.changeSize(80);
            circle.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        petal1.changeColor("black");
        petal2.changeColor("grey");
        leaf.changeColor("black");
        circle.changeColor("grey");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        petal1.changeColor("red");
        petal2.changeColor("magenta");
        leaf.changeColor("green");
        circle.changeColor("yellow");
    }
}
