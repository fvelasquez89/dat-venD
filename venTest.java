import java.awt.*;
import objectdraw.*;

public class venTest extends WindowController
{
	public static final int CANVAS_HEIGHT = 600;
	public static final int CANVAS_WIDTH =  400;
	public static final int DIAMETER = 180;

	private FramedOval circ1, circ2,circ3;

	public void begin()
	{
          int first_circ_pos = CANVAS_WIDTH / 4;
	  int radius = DIAMETER/2;
          Location first_anchor = new Location(first_circ_pos, CANVAS_HEIGHT/4);
	  Location second_anchor = new Location (first_circ_pos + radius, CANVAS_HEIGHT/4);
	  Location third_anchor = new Location(first_circ_pos + radius - 45, CANVAS_HEIGHT/4 + radius);
	  circ1 = new FramedOval(first_anchor, DIAMETER, DIAMETER, canvas);
	  circ2 = new FramedOval(second_anchor, DIAMETER, DIAMETER, canvas);
	  circ3 = new FramedOval(third_anchor, DIAMETER, DIAMETER, canvas);

	  circ1.setColor(Color.RED);
	  circ2.setColor(Color.BLUE);
	}
	
	public static void main(String[] args)
        {
  		new venTest().startController(CANVAS_WIDTH, CANVAS_HEIGHT);		
	}
} 

