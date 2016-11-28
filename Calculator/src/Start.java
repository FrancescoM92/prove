
import java.io.*;
import java.util.Scanner;

public class Start {
	public static void main(String[] var) throws MyException
	{		
		System.out.println("inserire il numero corrispondente all'operazione da svolgere:\n"
				+ "1. Addizione di due numeri\n"
				+ "2. Sottrazione di due numeri\n"
				+ "3. Moltiplicazione di due numeri\n"
				+ "4. Divisione di due numeri\n"
				+ "5. Calcolo area del rettangolo\n"
				+ "6. Calcolo area del quadrato\n"
				+ "7. Calcolo area del triangolo\n"
				+ "8. calcolo area del cerchio\n");
		try
		{
            InputStreamReader reader = new InputStreamReader (System.in);
            BufferedReader myInput = new BufferedReader (reader);
            String str = myInput.readLine();
        	System.out.println("inserire i numeri\n");
        	Scanner primoNumero = new Scanner (System.in);
            double result=0;
            String result1;
        	switch (str) 
            {
            	case "1":	
            	{
	                BasiCalculator calcolo = new BasiCalculator(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result =calcolo.add();
	            	break;
            	}          
	            case "2":	            
	            {
	                BasiCalculator calcolo = new BasiCalculator(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result =calcolo.sub();
	            	break;
	            }
	            case "3":
	            {
	                BasiCalculator calcolo = new BasiCalculator(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result =calcolo.mol();
	            	break;
	            }
	            case "4":
	            {
	                BasiCalculator calcolo = new BasiCalculator(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result =calcolo.div();
	            	break;
	            }
	            case "5":
	            {
	                Rect rettangolo = new Rect(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result = rettangolo.calcolaArea();
	            	break;
	            }
	            case "6":
	            {
	            	Square quadrato = new Square(primoNumero.nextDouble());
	            	result = quadrato.calcolaArea();
	            	break;
	            }
	            case "7":
	            {
	            	Triangle triangolo = new Triangle(primoNumero.nextDouble(), primoNumero.nextDouble());
	            	result = triangolo.calcolaArea();
	            	break;
	            }
	            case "8":
	            {
	            	Circle cerchio = new Circle(primoNumero.nextDouble());
	            	result = cerchio.calcolaArea();
	            	break;
	            }
	            
	            default:
	            {
	            	System.out.println("operazione non valida");
	            	break;
	            }
        	}
        	result1 = new Double(result).toString();
    		System.out.println(result1);
            reader.close();
        	primoNumero.close();
    	}
		catch (MyException my){
			System.err.println("errore divisione zero" + my.getMessage());
		}
		
		catch (Exception e)
		{
            System.err.println("Errore: " + e.getMessage());
    		//throw new MyException();
            //Start.main(var);
            //System.exit(1);
        }
	}
}
