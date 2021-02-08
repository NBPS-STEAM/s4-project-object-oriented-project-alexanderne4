import java.util.Scanner;

public class Fight{

  Scanner myScanner = new Scanner(System.in);
  int choice;
  public int shadowHp;
  public int playerHp;
  public int damage;

// Default Constructor 
  Fight(){
  shadowHp = 100; 
  playerHp = 100;
  damage = 15;
}
// Parameterized Constructor with three arguments 
Fight(int pHp, int sHp, int dmg)
{
playerHp = pHp;
shadowHp = sHp;
damage = dmg;
}

  public int getplayerHp() {
    return playerHp;
  }

    public int getshadowHp() {
    return shadowHp;
  }

      public void takeDamage(int damage) {
    playerHp -= damage;
  }

   public void startFight(){
  while(shadowHp <=100 && shadowHp !=20){
   System.out.println("\n1.FIRE!");
    System.out.println("\n2.DODGE!");
    choice = myScanner.nextInt();
    if(choice == 1){
      System.out.println("Nice shot!");
      shadowHp -= 20; 
      playerHp -= 50;
      startFight();
    }
    else{
      System.out.println("Thats was close!");
      playerHp += 25;
    }
    if(shadowHp <= 20){
      System.out.println("It ran away!");
      break;
    }
    while(playerHp <= 0){
      System.out.println("I can not stand anymore...");
      System.out.println("[SIGNAL LOST...]");
     System.out.println("[DISCONNECTED...]");
     playerHp +=100;
     shadowHp +=100;
    

    }
  }
}




}