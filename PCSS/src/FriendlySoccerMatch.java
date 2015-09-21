import java.util.ArrayList;
import java.util.Random;


public class FriendlySoccerMatch implements FriendlyMatch {

	private String nameHomeTeam;
	private String nameGuestTeam;
	private int pointsHome;
	private int pointsGuest;
	public ArrayList<String> save; //used later

	
	// Constructor
	public FriendlySoccerMatch(){
	 pointsHome = 0;
	 pointsGuest = 0;
	}

	// Interface methods that have to be implemented:
	public String getHomeTeam(){
	 return nameHomeTeam;
	}
	public String getGuestTeam(){
	 return nameGuestTeam;
	}
	public int getHomePoints(){
	 return pointsHome;
	}
	public int getGuestPoints(){
	 return pointsGuest;
	}
	
	public void startGame(Team t1, Team t2){
		 nameHomeTeam = t1.getName();
		 nameGuestTeam = t2.getName();
		 pointsHome = 0;
		 pointsGuest = 0;
		 // now the game can begin; we have to create for the
		 
		 Random r = new Random();
		 
		 boolean gameruns = true;
		 int gameduration = 90 + r.nextInt(5);
		 int time = 1;
		 int nextAction;
		 
		// while the game runs, goals can be scored
		 while (gameruns){
		  nextAction = r.nextInt(15)+1;
		  // Is the game over?
		  if ((time + nextAction > gameduration) || (time >
		  gameduration)){
		 gameruns = false;
		  break;
		  }
		  
		  save = new ArrayList<String>();  //Make an array of possibilities when you save the ball
		  save.add(" barely saves :D");
		  save.add(" saves");
		  save.add(" legendarily saves the ball");
		  save.add(" averagely saves.");
		  
		  
		 //*******************************************
		 // A new action can take place ...
		  
		 time = time + nextAction;
		 
		// influence of motivation on strength: We made a function for this since it calculates the same thing
		 
		 float strength_1 = calcThis(t1);
		 float strength_2 = calcThis(t2);
		 
		 // influence of trainer on strength:
		 
		 int deviation = r.nextInt(2);
		 
		 if (strength_1 > t1.getTrainer().getExperience())
			 
		 deviation = -deviation;
		 strength_1 = Math.max(1, Math.min(10, strength_1 + deviation));
		 deviation = r.nextInt(2);
		 	
		 if (strength_2 > t2.getTrainer().getExperience())
		  deviation = -deviation;
		 strength_2 = Math.max(1, Math.min(10, strength_2 + deviation));
		 int shooter = r.nextInt(10);
		 
		 if ((r.nextInt(Math.round(strength_1+strength_2))-strength_1)<=0){
		 Player p = t1.getPlayers()[shooter];
		 Keeper k = t2.getKeeper();
		 int shot = p.shootsOnGoal();
		 
		 // check if shot is saved
		 
		 boolean goal = !k.saveShot(shot);
		 
		 System.out.println();
		 System.out.println(time+".Minute: ");
		 System.out.println(" Chance for "+t1.getName()+" ...");
		 System.out.println(" "+p.getName()+" shoots");
		 
		 if (goal) {
			 pointsHome++;
			 p.addGoal();
			 System.out.println(" Goal!!! What a shot :D "+pointsHome+":"+
			 pointsGuest+" "+p.getName()+"("+p.getGoals()+")");
			 }
		 
			 else {
				 
				 System.out.println(" "+t2.getKeeper().getName()
						 + save.get(r.nextInt(save.size())));
			}
		 }
		 else{
			 Player p = t2.getPlayers()[shooter];
			 Keeper k = t1.getKeeper();
			 int shot = p.shootsOnGoal();
			 boolean shots = !k.saveShot(shot);
			 System.out.println();
			 System.out.println(time+".Minute: ");
			 System.out.println(" Chance for "+t2.getName()+" ...");
			 System.out.println(" "+p.getName()+" shoots");
		 
		 
		 if (shots) {
			 pointsGuest++;
			 p.addGoal();
			 System.out.println(" GOAL!!! "+pointsHome+":"+
			 pointsGuest+" "+p.getName()+"("+p.getGoals()+")");
			 } else {
			 System.out.println(" "+t1.getKeeper().getName()
			 + save.get(r.nextInt(save.size())));
			 }}}
		 
		 }
	
	 public float calcThis(Team t) {
		 float str = (t.getStrength()/2.0f) + ((t.getStrength()/2.0f)*(t.getMotivation()/10.0f));
		 return str;
	 }
		 
	public String getResultText(){
		return "The friendly game ends with\n\n"+nameHomeTeam+" - "+nameGuestTeam
		+" "+pointsHome+":"+pointsGuest+".";
		}
		}

