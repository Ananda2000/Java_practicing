package FacotryMEthod_DesignPattern;

public class ShapeFactory 
{
	public Shapes getShapes(String shapeType)
	{
		
		if(shapeType == null)
		{
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("square")) 
		{
			return new Square();
			
		}
		return null;
	}

}
