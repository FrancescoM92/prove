
public class LenghtException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString()
	{
		return super.toString() + " Leng Exception � lanciata tostring";
		
	}
	
	@Override 
	public String getMessage()
	{
		return super.getMessage() + " MyException � lanciata getmessage";
	}
	

}
