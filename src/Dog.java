import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
public class Dog extends Racer{

    private int speed;
    private Random rand;

    public Dog() {
        super();
    }

    /** Constructor
     *    @param rID   racer Id, passed to Racer constructor
     *    @param rX    x position, passed to Racer constructor
     *    @param rY    y position, passed to Racer constructor
     */

    public Dog( String rID, int rX, int rY )
    {
        super( rID, rX, rY );
    }

    @Override
    public void move() {
        Random rand = new Random();
        int move = rand.nextInt();

        if (move % 5 == 0) {
            setX(getX() + 5);
        }
        else {
            setX(getX());
        }
    }

    /** draw: draws the Dog at current (x, y) coordinate
     *   @param g   Graphics context
     */

    @Override
    public void draw(Graphics g) {
        int startY = getY();
        int startX = getX();

        //tail
        g.setColor(new Color(139,69,19));
        g.fillOval(startX -35, startY +5, 20, 8);

        //feet
        g.setColor(new Color(139,69,19));
        g.fillOval(startX - 25, startY + 10, 10, 15);
        g.fillOval(startX -5, startY + 10, 10, 15);

        //body
        g.setColor(new Color(205,133,63));
        g.fillOval(startX -30, startY, 40, 20);

        //head
        g.setColor(new Color(205,133,63));
        g.fillOval(startX -5, startY -10, 25, 20);

        //ear
        g.setColor(new Color(139,69,19));
        g.fillOval(startX -5, startY -8, 10, 15);

        //eye
        g.setColor(new Color(139,69,19));
        g.fillOval(startX +8, startY -5, 5,5);

    }
}
