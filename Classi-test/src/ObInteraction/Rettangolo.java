package ObInteraction;

public class Rettangolo {
	private int lato1;
	private int lato2;
	
	public Rettangolo(int a, int b){
		this.lato1=a;
		this.lato2=b;
	}
	
	public Rettangolo(){
		this.lato1=0;
		this.lato2=0;
	}
	
	public int getLato1() {
		return lato1;
	}
	public void setLato1(int lato1) {
		this.lato1 = lato1;
	}
	public int getLato2() {
		return lato2;
	}
	public void setLato2(int lato2) {
		this.lato2 = lato2;
	}
	
	public int getArea(){
		return lato1*lato2;
	}
	
	public int getPerimetro(){
		return (lato1+lato2)*2;
	}
	
	
}
