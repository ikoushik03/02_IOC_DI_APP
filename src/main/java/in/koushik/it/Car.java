package in.koushik.it;

public class Car {
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Non para meter Constructor");
	}
	
	public Car(IEngine eng) {
		
		System.out.println("Para meter constructor");
		this.eng=eng;
		
	}
	
	public void setEng(IEngine eng) {
		
		System.out.println("Setter method called");
		this.eng = eng;
	}
	
	public void drive()
	{
		int start = eng.start();
		if(start >=1)
		{
			System.out.println("Journey started");
		}
		else {
			System.out.println("Engine in trouble");
		}
	}

}
