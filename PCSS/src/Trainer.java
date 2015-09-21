
public class Trainer extends Person {
	
	private int experience;
	
	public Trainer(String n, int a, int e){
		super(n,a); 
		experience = e;
	}
	
	
	public int getExperience(){
		return experience;
	}
	public void setExperience(int e){
		experience = e;
	}
	
}
