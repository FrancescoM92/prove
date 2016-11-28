
public class Square implements IArea 
{	
	private double lato;
	
	public Square (double lato)
	{
		this.lato = lato;
	}
	
	public double getLato() 
	{
		return lato;
	}

	public void setLato(double lato) 
	{
		this.lato = lato;
	}

	@Override
	public double calcolaArea() 
	{
		return lato*lato;
	}
}
