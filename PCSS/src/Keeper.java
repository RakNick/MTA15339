import java.util.Random;

public class Keeper extends Player {
	private int reaction;
	
	public Keeper(String n, int a, int s, int t, int m, int r) {
		super(n, a, s, t, m);
		reaction = r;
	}
	
	public void setReaction(int r){
		reaction = r;
	}
	
	public int getReaction(){
		return reaction;
	}
	
	public boolean saveShot(int shot){
		 Random r = new Random();
		 // +-1 as little randomness
		 int ret = Math.max(1, Math.min(10, reaction +
		 r.nextInt(3)-1));
		 if (ret>=shot)
		 return true; // saved
		 else
		 return false; // GOOOOOOAL!!!
		}
}
