package in.koushik.it;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine constructor");
	}

	@Override
	public int start() {
		System.out.println("PetrolEngine started");
		return 1;
	}

}
