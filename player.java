import java.util.Scanner;
import java.util.*;

public class  player {

  static Scanner myScanner = new Scanner(System.in);
  public static String playerName;
  int playerHp = 100;


  public static void playerSetUp(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("                       12:08AM                             ");
   
   int timeToWait = 10; 
        System.out.println("[CONNECTING...]");
        try {
            for (int i=0; i<timeToWait ; i++) {
                Thread.sleep(500);
                System.out.println("_._._._._");
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
   System.out.println("[AUTHORIZING...]");
   System.out.println("[SUCCESSFUL...]");
   System.out.println("Hey there, can anyone see it?");


		System.out.println("My name is Coueus, I'm the crew member of the secret operation");
    System.out.println("Well, last crew member....");
    System.out.println("What is your name stranger?");
      playerName = myScanner.nextLine();
      System.out.println("Hmmm... " + playerName + ", sounds promising..");
  }
}