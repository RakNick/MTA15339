import java.util.Random;

public class Player extends Person {
	private int goal;
	private int motivation;		//From one to ten
	private int shots;
	private int strength;
	
	public Player(String n, int a, int m, int s, int st){
		super(n,a);
		goal = 0;
		motivation = m;
		shots = s;
		strength = st;
	}
	
	public int shootsOnGoal(){
		Random r = new Random();
		shots = Math.max(1, Math.min(10, shots - r.nextInt(3)));
		int ret = Math.max(1, Math.min(10, shots + r.nextInt(3)-1));
		return ret;
		}
	
	public int getGoals() {
		return goal;
	}
	public void addGoal(){
		goal = goal+1;
	}
	public int getMotivation(){
		return motivation;
	}
	public void setMotivation(int m){
		motivation = m;
	}
	public int getShots(){
		return shots;
	}
	public void setShots(int s){
		shots = s;
	}
	public int getStrength(){
		return strength;
	}
	public void setStrength(int s){
		strength = s;
	}

}
