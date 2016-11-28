
public class Circle implements IArea
{
	private double ray;
	
	public Circle (double ray)
	{
		this.ray=ray;
	}
	
	public double getRay() 
	{
		return ray;
	}

	public void setRay(double ray) 
	{
		this.ray = ray;
	}

	@Override
	public double calcolaArea() 
	{
		return ray*ray*3.14;
	}

}
