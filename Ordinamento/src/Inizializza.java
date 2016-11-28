import java.util.*;


public class Inizializza {
	
	public static void main (String[] arg){
		
		int[] array1 = {10 , 20, 15, 30, 1, 7, 3, 21, 33, 40};
		int[] array2 = {44, 37, 11, 5, 0, 31, 8, 18, 28, 2};
		
		ArrayList<int[]> lista = new ArrayList<int[]>();
		
		lista.add(array1);
		lista.add(array2);
		
		int[] arrayResult = new int[20];
		
		ArrayOrder.listMerger(lista, arrayResult);
		//ArrayOrder.arrayMerger(array1, array2, arrayResult);
		ArrayOrder.printArray(array1);
		ArrayOrder.printArray(array2);
		ArrayOrder.printArray(arrayResult);
		ArrayOrder.bubbleSort(arrayResult);
		ArrayOrder.printArray(arrayResult);
	}
}
