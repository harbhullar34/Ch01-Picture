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
    private Triangle petal3;
    private Triangle petal4;
    private Triangle petal5;
    private Triangle petal6;
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
        petal3 = new Triangle(); 
        petal4 = new Triangle(); 
        petal5 = new Triangle(); 
        petal6 = new Triangle(); 
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
            
            petal3.changeColor("red");
            petal3.changeSize(60, 180);
            petal3.moveHorizontal(20);
            petal3.moveVertical(-60);
            petal3.makeVisible();
            
            petal4.changeColor("magenta");
            petal4.changeSize(60, 180);
            petal4.moveHorizontal(20);
            petal4.moveVertical(-60);
            petal4.makeVisible();
            
            petal5.changeColor("red");
            petal5.changeSize(60, 180);
            petal5.moveHorizontal(20);
            petal5.moveVertical(-60);
            petal5.makeVisible();
            
            petal6.changeColor("magenta");
            petal6.changeSize(60, 180);
            petal6.moveHorizontal(20);
            petal6.moveVertical(-60);
            petal6.makeVisible();
           
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
        petal3.changeColor("black");
        petal4.changeColor("grey");
        petal5.changeColor("black");
        petal6.changeColor("grey");
        leaf.changeColor("grey");
        circle.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        petal1.changeColor("red");
        petal2.changeColor("magenta");
        petal3.changeColor("red");
        petal4.changeColor("magenta");
        petal5.changeColor("red");
        petal6.changeColor("magenta");
        leaf.changeColor("green");
        circle.changeColor("yellow");
    }
}
