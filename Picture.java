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
    private Triangle nacho1;
    private Triangle nacho2;
    private Triangle nacho3;
    private Triangle nacho4;
    private Triangle nacho5;
    private Triangle nacho6;
    private Triangle nacho7;
    private Circle salsa;
    private Circle salsaBowl;
    private Circle bowl;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        nacho1 = new Triangle();  
        nacho2 = new Triangle(); 
        nacho3 = new Triangle(); 
        nacho4 = new Triangle(); 
        nacho5 = new Triangle(); 
        nacho6 = new Triangle(); 
        nacho7 = new Triangle();
        salsa = new Circle(); 
        salsaBowl = new Circle();
        bowl = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) { 
            salsaBowl.changeColor("black");
            salsaBowl.changeSize(50);
            salsaBowl.moveHorizontal(60);
            salsaBowl.moveVertical(-100);
            salsaBowl.makeVisible();
            
            salsa.changeColor("red");
            salsa.changeSize(45);
            salsa.moveHorizontal(60);
            salsa.moveVertical(-100);
            salsa.makeVisible();
            
            bowl.changeColor("black");
            bowl.changeSize(200);
            bowl.moveHorizontal(-10);
            bowl.moveVertical(-40);
            bowl.makeVisible();
            
            nacho1.changeColor("yellow");
            nacho1.changeSize(50, 50);
            nacho1.moveHorizontal(80);
            nacho1.moveVertical(40);
            nacho1.makeVisible();
            
            nacho2.changeColor("yellow");
            nacho2.changeSize(50, 40);
            nacho2.moveHorizontal(150);
            nacho2.moveVertical(30);
            nacho2.makeVisible();
            
            nacho3.changeColor("yellow");
            nacho3.changeSize(50, 40);
            nacho3.moveHorizontal(80);
            nacho3.moveVertical(-20);
            nacho3.makeVisible();
            
            nacho4.changeColor("yellow");
            nacho4.changeSize(50, 65);
            nacho4.moveHorizontal(70);
            nacho4.moveVertical(-75);
            nacho4.makeVisible();
        
            nacho5.changeColor("yellow");
            nacho5.changeSize(40, 30);
            nacho5.moveHorizontal(170);
            nacho5.moveVertical(-30);
            nacho5.makeVisible();
            
            nacho6.changeColor("yellow");
            nacho6.changeSize(50, 30);
            nacho6.moveHorizontal(130);
            nacho6.moveVertical(-20);
            nacho6.makeVisible();
            
            nacho7.changeColor("yellow");
            nacho7.changeSize(40, 30);
            nacho7.moveHorizontal(130);
            nacho7.moveVertical(-70);
            nacho7.makeVisible();
           
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        nacho1.changeColor("white");
        nacho2.changeColor("white");
        nacho3.changeColor("white");
        nacho4.changeColor("white");
        nacho5.changeColor("white");
        nacho6.changeColor("white");
        nacho7.changeColor("white");
        salsa.changeColor("grey");
        salsaBowl.changeColor("black");
        bowl.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        nacho1.changeColor("yellow");
        nacho2.changeColor("yellow");
        nacho3.changeColor("yellow");
        nacho4.changeColor("yellow");
        nacho5.changeColor("yellow");
        nacho6.changeColor("yellow");
        nacho7.changeColor("yellow");
        salsaBowl.changeColor("black");
        salsa.changeColor("red");
        bowl.changeColor("black");
    }
}
