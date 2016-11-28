public class BasiCalculator
{
	private double val1;
	private double val2;
	
	public BasiCalculator(double val1, double val2)
	{
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public double add()
	{		
		return val1 + val2;
	}
	
	public double sub()
	{
		return val1 - val2;
	}
	
	public double mol()
	{
		return val1 * val2;
	}
	
	public double div() throws MyException
	{	
		if (val2 ==0)
		{
			throw new MyException();
		}
		return val1 / val2;
	}
}
