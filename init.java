import java.util.Scanner;

//this class introduces the story to the player
public  class init{

Scanner myScanner = new Scanner(System.in);
public String playerName;
int choice;
public  void intro(){
  
 System.out.println("\n1.Are you kidding me?");
    System.out.println("\n2.What happened?");
    System.out.println("\n3.Is it someone's prank?");
    choice = myScanner.nextInt();
    if(choice == 1 || choice == 3){
      System.out.println("\n I have no time to explain, just stay in touch with your phone or PC whatever system I got connected to..");
      
    }
		else{
   System.out.println("BOOM!");
    System.out.println("Blinding light...");
    System.out.println("Woke up on some kind of planet");
		System.out.println("Completele alone...");
    System.out.println("So you are my last chance to survive and keep my mind.Just stay in touch with your phone or PC whatever system I got connected to.. ");

    }
    System.out.println("NO NO NO, NOT NOW!");
    System.out.println("[SIGNAL LOST...}");
    System.out.println("[DISCONNECTED...}");
    System.out.println ("-----------------------------------------------------------------");
    System.out.println("-----------------------------------------------------------------");
 System.out.println("                       06:55PM                             ");
 System.out.println("[CONNECTING...]");
 System.out.println("[AUTHORIZING...]");
 System.out.println("[SUCCESSFUL...]");
 System.out.println("Hey " + playerName + ", just had a frozen seaweed for diner, disgusting...");
 System.out.println("I will explain you everything, but you have to keep it between us, ok?");
 System.out.println("I'm a member,hmm ex-member, of the secret operation [Tomorow's sunrise]. This operation was founded by the goverments of 56 countries. Our goal was to settle on the planet named SU-556 and find the source of the signal that US goverment got somwhere in 1960. After they decoded this signal they got next message [We are watching you].");
 System.out.println("We flew to this planet in 1969 under the huise of flying to the moon.");
 System.out.println("However, we were entering the atmosphere, when something strange happened...");
 System.out.println("I'm the only one who alive and now I'm sitiing in the emergency capsule, and using the on-board computer I got connected with you instead of headquarters");
 System.out.println("Pretty suspicious errors... Like someone wanted us to die");
 System.out.println("I'm just a coder, so I dont know anything about the flora and fauna on this planet and other stuff, so your role is gonna be to help me with everything, I'm pretty sure that I will die, but I want to share everything with you, so at least someone will know and show the people whats going on here");
   System.out.println("[SIGNAL LOST...}");
    System.out.println("[DISCONNECTED...}");
 System.out.println ("-----------------------------------------------------------------");

}



}