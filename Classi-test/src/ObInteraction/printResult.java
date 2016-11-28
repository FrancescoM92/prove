package ObInteraction;

public class printResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo rect = new Rettangolo(35, 25);
		
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da main");
		
		ChangeRect ch = new ChangeRect();
		
		ch.cambiaRect(rect);
		
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da main 2");
		
		ch.cambiaRect2(rect);
		
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da main 3");
		
		ChRect cr = new ChRect();
		cr.setRect(rect);
		
		
		(new Thread(cr)).start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rect = cr.getRect();
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da main 4");
		
	}

}
