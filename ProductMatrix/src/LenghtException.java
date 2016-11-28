
public class LenghtException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString()
	{
		return super.toString() + " Leng Exception è lanciata tostring";
		
	}
	
	@Override 
	public String getMessage()
	{
		return super.getMessage() + " MyException è lanciata getmessage";
	}
	

}
