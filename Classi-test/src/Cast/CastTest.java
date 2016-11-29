package Cast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a= 0;
		Double b= new Double(0);
		
		try {

			System.out.println("inserisci double");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			b=Double.parseDouble(br.readLine());
			a = b.longValue();
			
			if(b-a>0){
				System.out.println(b-a);
			}
			
			double c = 145.98;
			long d = (long)c;
			System.out.print(d);
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
