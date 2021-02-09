import java.util.Scanner;

public class Features {
  
  Scanner myScanner = new Scanner(System.in);
  private int password; 
  private int shadowHp = 100; 
  private int playerHp = 100;
  private int gun;
  private int medkit;
  private int flashlight;
  private int choice; 
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
}