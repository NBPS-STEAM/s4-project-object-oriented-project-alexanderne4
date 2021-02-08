import java.util.Scanner;

public class Features {
  
  Scanner myScanner = new Scanner(System.in);
  int password; 
  int shadowHp = 100; 
  int playerHp = 100;
  int gun;
  int medkit;
  int flashlight;
  int choice; 
// logic game
public void passwordGame(Player player){
  System.out.println("There is a code lock on the door, I have a paper where states [24816..], but the last two numbers scrached. Do you have any ideas?");
  while(true) { 
    System.out.println("//Type the full password//");
      
    password = myScanner.nextInt();
    if(password == 2481632){            //getter
      System.out.println("Nice job! " + player.getPlayerName());
      break;
    }
    else {
      System.out.println("Try again! " + player.getPlayerName());
      System.out.println("I think you should find a regularity between numbers");
      
    }
  } 
}

// inventory 
 public void inventory(){
    System.out.println("\n1.MEDKIT");
    System.out.println("\n2.GUN");
    System.out.println("\n3.FLASHLIGHT");
    choice = myScanner.nextInt();
    if(choice == 1){
   medkit = 1; 
   gun = 0;
   flashlight = 0; 
   System.out.println("I thought the same");
    }
    else if(choice == 2){
       medkit = 0; 
       gun = 1;
       flashlight = 0; 
   System.out.println("I'm not sure how to use it, but okay.");
    }
    else if(choice == 3){
      medkit = 0; 
      gun = 0;
      flashlight = 1;
    System.out.println("It won't be superfluous");
    }
  }

// fighting system
  public void fight(){
  while(shadowHp <=100 && shadowHp !=20){
   System.out.println("\n1.FIRE!");
    System.out.println("\n2.DODGE!");
    choice = myScanner.nextInt();
    if(choice == 1){
      System.out.println("Nice shot!");
      shadowHp -= 20; 
      playerHp -= 50;
      fight();
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