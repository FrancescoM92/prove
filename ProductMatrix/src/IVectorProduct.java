
public interface IVectorProduct {
	
	public void vScalarProduct(int[]v1 ,int[]v2, int result) throws LenghtException;
	
	public void vVectorialProduct(int[]v1, int[]v2, int[]vresult) throws LenghtException;
	
	public void matrixProduct(int[][]m1, int[][]m2, int[][]mresult) throws LenghtException;
	

}
