package ObInteraction;

public class ChRect implements Runnable{
	
	private Rettangolo rect;
	
	
	
	public Rettangolo getRect() {
		return rect;
	}



	public void setRect(Rettangolo rect) {
		this.rect = rect;
	}



	@Override
	public void run(){
		System.out.println("lato1: " + 
				rect.getLato1() + " " +
				"lato2: " + 
				rect.getLato2() + 
				" Stampato da run");
		
		rect.setLato1(rect.getLato1() + 35);
		rect.setLato2(rect.getLato2() + 35);
		
		System.out.println("lato1: " + 
							rect.getLato1() + " " +
							"lato2: " + 
							rect.getLato2() + 
							" run 2");
		
		
		
	}

}
