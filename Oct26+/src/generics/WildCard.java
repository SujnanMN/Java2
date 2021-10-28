package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	public static void drawShapes(List<?extends Shape>shapesList)
	{
		for (Shape shape: shapesList)
			shape.drawShape();
	}
	public static void main(String[] args) {
		List<Rectangle> rec = new ArrayList<>();
		rec.add(new Rectangle());
		rec.add(new Rectangle());
		List<Circle> cir = new ArrayList<>();
		cir.add(new Circle());
		drawShapes(cir);
		drawShapes(rec);
		
	}

}
