public class MyException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString()
	{
		return super.toString() + " My Exception è lanciata tostring";
		
	}
	
	@Override 
	public String getMessage()
	{
		return super.getMessage() + " MyException è lanciata getmessage";
	}

}
