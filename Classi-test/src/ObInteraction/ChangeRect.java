package ObInteraction;

public class ChangeRect{
	
	public void cambiaRect(Rettangolo rect){
		rect.setLato1(rect.getLato1() + 50);
		rect.setLato2(rect.getLato2() + 100);
		
		System.out.println("lato1: " + 
							rect.getLato1() + " " +
							"lato2: " + 
							rect.getLato2() + 
							" Stampato da cambiaRect");
	}
		
	public void cambiaRect2(Rettangolo rect){
		rect = new Rettangolo();
		rect.setLato1(20);
		rect.setLato2(30);
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da cambiaRect2");
		
	}


}
