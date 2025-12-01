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
      }

      else if (command.equals("e") ){
         System.out.println("You've got a bike! Now bike through the forest.");  
      }

      else{ (command.equals("n"))
         System.out.println("follow the path, and take Harrington's car down Hopper Highway");
         System.out.println("Oh noooo! the signal is lost");
         System.out.println("PICK YOUR POISEON");
       }





    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
