import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
          
      // STEP #1: Describe the current scenario 
      System.out.println("You are at the byers house.");
      //STEP #2: Get user command 
      command = getCommand("Do you go south (s), east (e) or west (w)");
      
      
      //STEP #3: Select a path base don the users command
      if (command.equals("s") ) {
         //NEXT BRANCH...
         System.out.println("Walk down Demogrogan Drive.");
         System.out.println("WOAH! you have tripped into a portal and landed in...CALIFORNIA WHAT");
      }

      else if (command.equals("e") ){
         System.out.println("You've got a bike, and a backpack full of esstentials! Now bike through the forest.");  
         System.out.println("you discovered a creepy, slimy, red, hole, Do you want to go through and explore");
         command = getCommand("explore or stay curious"); 
          }
        
        if (command.equals("y") ){
         System.out.println("go through, and dont forget your backpack");
         System.out.println("Welcome to the upside down");
            }
     
         else if (command.equals("n")){
         System.out.println("get back on your bike, and ride to The Wheeler House");System.out.println ("You have arrived and run down to the basement, \"What the hell was that\" -Lucas Sinclair");
      }

      else if (command.equals("w")) {
         System.out.println("follow the path, and take Harrington's car down Hopper Highway");
         System.out.println("Oh noooo! the signal is lost");
         System.out.println("PICK YOUR POISEON");
         command = getCommand("Left or Right? (l or r"); 

         if (command.equals("l") ) {
            System.out.println("You need to stall in order for the plan to succssed(s or d"); 
            command = getCommand("s or d"); 
         
          if(command.equals ("s")){
            System.out.println("You outsmarted the Mindflayer...(for now)! Nice job on dropping a speaker while Steve was driving, it ran off to the sound"); 
            System.out.println("Head to the Starcourt Mall, and meet up with eveyone");
         } 
            else if (command.equals("d")){
               System.out.println("The Mindflayer ripped open the roof and killed you all, mission failed");
            
             }
         }
         
         }
         else if (command.equals("r")) {
               System.out.println("The demogrogans are chasing the car, you need to get away.");
               System.out.println("Nacy shot them away, but Dustin got hurt while steve was driving, go back to the Byers house");
               System.out.println("back to the Byer house");
            }
         }  
     
      
      

      




     // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       
       return command;
    } // END OF METHOD
 } // END OF CLASS
