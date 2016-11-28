
public class Rect implements IArea
{
	private double lato1;
	private double lato2;
	
	public Rect(double lato1, double lato2)
	{
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	public double getLato1() 
	{
		return lato1;
	}
	
	public void setLato1(double lato1) 
	{
		this.lato1 = lato1;
	}

	public double getLato2() 
	{
		return lato2;
	}

	public void setLato2(double lato2) 
	{
		this.lato2 = lato2;
	}

	@Override
	public double calcolaArea() 
	{
		return lato1*lato2;
	}
}
