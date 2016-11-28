import java.util.*;

public class ArrayOrder 
{
	
	private static void swap(int[] array, int a, int b)
	{
		int c = array[a];
		array[a] = array[b];
		array[b] = c;
		
	}
	
	public static void printArray(int[]array)
	{
		System.out.print("\n");
		for(int i : array)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	
	public static void listMerger(ArrayList<int[]> list, int[] array)
	{
		for(int[] i : list )
		{
			arrayMerger(array ,i , array);
		}
	}
	
	public static void arrayMerger(int[] array1, int[] array2, int[] arrayResult)
	{
		int y=0;
		for (int i : array1)
		{
			arrayResult[y]=i;
			y++;
		}
		y=array1.length;
		for(int i : array2)
		{
			arrayResult[y]=i;
			y++;
		}
	}
	public static void quickSort(int[]array)
	{
		Random rand = new Random();
		int pivInd = rand.nextInt(array.length);
		int pivot = array[pivInd];
		int a=0;
		int b=array.length-1;
		boolean c1=false;
		boolean c2=false;
		while (a<pivInd && b>pivInd)
		{
			if(array[a] )
		}
		
	}
	
	
	public static void bubbleSort(int[]arrayResult)
	{	
		int n=arrayResult.length;
		boolean controllo = true;
		while (controllo)
		{
			int k=1;
			controllo=false;
			while (k<n)
			{
				if (arrayResult[k-1] > arrayResult[k])
				{
					swap(arrayResult, k, k-1);
					controllo = true;
				}
				k++;
			}	
		}
	}
}
