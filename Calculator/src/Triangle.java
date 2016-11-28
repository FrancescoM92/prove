
public class Triangle implements IArea 
{
	private double lato;
	private double altezza;
	
	public Triangle(double lato, double altezza)
	{
		this.lato = lato;
		this.altezza = altezza;
	}
	
	public double getLato() 
	{
		return lato;
	}

	public void setLato(double lato) 
	{
		this.lato = lato;
	}

	public double getAltezza() 
	{
		return altezza;
	}

	public void setAltezza(double altezza) 
	{
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() 
	{
		return lato*altezza/2;
	}
}
