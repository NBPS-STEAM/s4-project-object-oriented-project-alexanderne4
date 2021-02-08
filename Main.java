
import java.util.*;

class Main {

  //int choice; 
  //int gun;
  //int medkit;
  //int flashlight;
  //int map;
  //int password; 
  //int shadowHp = 100; 
  //int playerHp = 100;
  //double radiation; 
  //int line;

      public static void main(String[] args) { 
        // instantiationg classes(possibility to create couple players)
        
        Player newPlayer = new Player();
        init init = new init();
        features invent = new features();
        features pass = new features();
        Fight kkk = new Fight();
        DevIntro me = new DevIntro(2002, "Alexander", 2);

      //executing 
        newPlayer.playerSetUp();
        init.intro();
        invent.inventory();
        pass.passwordGame(newPlayer);
        kkk.startFight();
      } 
  
  }