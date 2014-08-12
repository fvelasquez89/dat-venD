import java.awt.*;
import objectdraw.*;
import java.lang.Math;

public class venTest extends WindowController
{
	public static final int CANVAS_HEIGHT = 600;
	public static final int CANVAS_WIDTH =  600;
	public static final int DIAMETER = 150;

	private FramedOval circ1, circ2,circ3;
	private Location center1, center2, center3;
        private Line hor,vert;

	public void begin()
	{
		int radius = DIAMETER/2;
		double k, h;
		double a,b,c;
		double firstx, secondx, firsty,secondy;

		//Location infor for left circle
		int leftx = CANVAS_WIDTH/4;
		int lefty = 50;
		Location anch1 = new Location(leftx,lefty);
		center1 = new Location(leftx+radius, lefty+radius);
//		Line l1 = new Line(center1.getX(), lefty, center1.getX(), lefty + DIAMETER, canvas);

		//Location info for right circle
		int rightx = leftx + radius;
		int righty = lefty;
		Location anch2 = new Location(rightx, righty);
		center2 = new Location(rightx+radius, righty+radius);

		//Locatino info for bottom
		int bottomx = (int)center1.getX();
		int bottomy = (int)center1.getY();
		Location anch3 = new Location(bottomx, bottomy);
		center3 = new Location(bottomx + radius, bottomy + radius);

		h = ((Math.pow(center2.getY(),2)-Math.pow(center1.getY(),2))/(2*(center2.getX()-center1.getX()))) + ((center2.getX() + center1.getX())/2);
		k = (center1.getY()-center2.getY())/(center2.getX()-center1.getX());
		a = 1 + Math.pow(k, 2);
		b = 2*(h*k - center1.getX() - k*center1.getY());
		c = Math.pow(h,2) - 2*center1.getX()*h + Math.pow(center1.getX(),2) + Math.pow(center1.getY(),2) - Math.pow(radius, 2);
		firsty = (-1*b + (Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a);
		secondy = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);

		Line da = new Line(center1.getX(), firsty,center1.getX() + 100,firsty, canvas);
		Text newT = new Text((center1.getY() - center2.getY()),10, 500, canvas); 

		circ1 = new FramedOval(anch1,DIAMETER, DIAMETER,canvas);
		circ2 = new FramedOval(anch2,DIAMETER,DIAMETER,canvas);
		circ3 = new FramedOval(anch3,DIAMETER,DIAMETER,canvas);

	}
	
	public static void main(String[] args)
        {
  		new venTest().startController(CANVAS_WIDTH, CANVAS_HEIGHT);		
	}
} 

