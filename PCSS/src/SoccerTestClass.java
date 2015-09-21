public class SoccerTestClass{
public static void main(String[] args){
// *************************************************************
// Team 1 (Germany)
Trainer t1 = new Trainer("Captain Marvel", 34, 9);
Keeper k1 = new Keeper("Spider Man", 36, 8, 1, 9, 7);
Player[] p1 = new Player[10];
p1[0] = new Player("Hulk", 23, 9, 5, 9);
p1[1] = new Player("Iron Man", 25, 11, 11, 11);
p1[2] = new Player("Human Torch", 22, 9, 2, 8);
p1[3] = new Player("Daredevil", 29, 7, 5, 8);
p1[4] = new Player("Captain America", 26, 9, 8, 9);
p1[5] = new Player("Luke Cage", 22, 7, 5, 8);
p1[6] = new Player("Jeff Snake", 22, 10, 10, 10);
p1[7] = new Player("Thor", 21, 7, 8, 9);
p1[8] = new Player("Wolverine", 28, 10, 9, 7);
p1[9] = new Player("Black Widow", 33, 8, 8, 7);

//Team 2 (Brazil)
Trainer t2 = new Trainer("Mario", 50, 3);
Keeper k2 = new Keeper("Luigi", 25, 9, 1, 6, 8);
Player[] p2 = new Player[10];
p2[0] = new Player("Peach", 33, 8, 4, 6);
p2[1] = new Player("Wario", 32, 9, 9, 2);
p2[2] = new Player("Waluigi", 29, 10, 9, 9);
p2[3] = new Player("Toad", 25, 10, 9, 5);
p2[4] = new Player("Bowser", 27, 7, 7, 4);
p2[5] = new Player("Link", 22, 10, 8, 10);
p2[6] = new Player("Zelda", 26, 7, 10, 3);
p2[7] = new Player("Yoshi", 23, 8, 8, 4);
p2[8] = new Player("Donkey Kong", 19, 9, 8, 9);
p2[9] = new Player("Diddy Kong", 28, 4, 10, 2);
Team tm1 = new Team("Marvel 2006",t1,k1,p1);
Team tm2 = new Team("Nintendo 2006",t2,k2,p2);
FriendlySoccerMatch f1 = new FriendlySoccerMatch();


System.out.println("------------------------------------------");
System.out.println("Start Game between");
System.out.println();
System.out.println(tm1.getName());
System.out.println(" Trainer: "+tm1.getTrainer().getName());
System.out.println();
System.out.println(" and");
System.out.println();
System.out.println(tm2.getName());
System.out.println(" Trainer: "+tm2.getTrainer().getName());
System.out.println("------------------------------------------");
f1.startGame(tm1, tm2);
System.out.println();
System.out.println("------------------------------------------");
System.out.println(f1.getResultText());
System.out.println("------------------------------------------");
}
}