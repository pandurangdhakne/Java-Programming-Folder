
import java.util.Scanner;
import java.util.Random;






public class stone_paper_seccior_game {
    

    public static void main(String[] args) {
        
     String s = "stone";
     String p = "paper";
     String c = "scissors";

     String [] play = {s,p,c};
     

Scanner sc = new Scanner(System.in);
Random ran = new Random();


     String yourplay;
     String complay;
     int index;
  
    boolean quit = false;

                while(!quit)
                {

                System.out.println("Do you play : (stone/paper/scissors)");
                yourplay = sc.nextLine();

                index = ran.nextInt(3);
                complay = play[index];

                System.out.println("YourPlay = "+ yourplay + "     compauter's play = "+ complay);


                            if(yourplay.equals(complay))
                            {
                                System.out.println("match is Tie!!");
                            }

                            else if(yourplay.equals(s) && complay.equals(p))
                            {
                                System.out.println("computer's win !!");
                            }

                            else if(yourplay.equals(s) && complay.equals(c))
                            {
                                System.out.println("You win !!");
                            }

                            else if(yourplay.equals(c) && complay.equals(s))
                            {
                                System.out.println("computer's win !!");
                            }

                            else if(yourplay.equals(c) && complay.equals(p))
                            {
                                System.out.println("You win !!");
                            }

                            else if(yourplay.equals(p) && complay.equals(c))
                            {
                                System.out.println("computer's win !!");
                            }

                            else if(yourplay.equals(p) && complay.equals(s))
                            {
                                System.out.println("You win !!");
                            }


                }

    System.out.println("Thanks to play with me computer my dear pattner !!");



    }



}
