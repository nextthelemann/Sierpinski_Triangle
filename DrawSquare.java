import java.awt.Color;

public class DrawSquare {
	public static void main(String[] args) {
		double[] x = {.1, .2, .3, .2};
		double[] y = {.2, .3, .2, .1};
		StdDraw.filledPolygon(x,y);
	}
}