import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.awt.event.KeyEvent;

// throws FileNotFoundException, java.io.IOException 

public class Pokerito {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);

        // File f = new File("C:\\Users\\gergr\\OneDrive\\Dokumentumok\\JavaLearning\\Java-Bootcamp-Resources-main\\Java-Bootcamp-Resources-main\\Module 1 - Introduction to Java\\5. Loops\\Pokerito\\card.txt");
        // BufferedReader br = new BufferedReader(new FileReader(f));

        // "C:\\Users\\gergr\\OneDrive\\Dokumentumok\\JavaLearning\\Java-Bootcamp-Resources-main\\Java-Bootcamp-Resources-main\\Module 1 - Introduction to Java\\5. Loops\\Pokerito\\card.txt");
      
        // File file = new File("C:\\Users\\gergr\\OneDrive\\Dokumentumok\\JavaLearning\\Java-Bootcamp-Resources-main\\Java-Bootcamp-Resources-main\\Module 1 - Introduction to Java\\5. Loops\\Pokerito\\card.txt");

        File file = new File("cards.txt");
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.next();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println( "• There are two players, you and the computer.\n" +
                            "• The dealer will give each player one card.\n" +
                            "• Then, the dealer will draw five cards (the river)\n" +
                            "• The player with the most river matches wins!\n" +
                            "• If the matches are equal, everyone's a winner!\n");
        System.out.println("• Ready? Type anything if you are.");
        scan.next();

        System.out.println("Here's your card: ");
        String userCard = randomCard();
        System.out.println(userCard + "\n");
        String pcCard = randomCard();
        System.out.println("Pc's card: " + pcCard);
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");

        //Stop before asking user to press enter
        scan.nextLine();
        String userEnter = scan.nextLine();

        // Checking if user hit enter
        pressedEnter(userEnter, scan);
        System.out.println("Game continues");


        int yourMatches = 0;
        int computerMatches =0;
        drawRiver(scan, yourMatches, computerMatches, userCard, pcCard);

        checkWinner(yourMatches, computerMatches);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */

    

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        // String txtFilePath = "C:\Users\gergr\OneDrive\Dokumentumok\JavaLearning\Java-Bootcamp-Resources-main\Java-Bootcamp-Resources-main\Module 1 - Introduction to Java\5. Loops\Pokerito\card.txt"
        // System.out.println(f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("\\")+1));
        Random rand = new Random();
        String[] stringList = new String[12];
        int randNum = rand.nextInt(stringList.length) + 1;

        switch (randNum){
            case 1:
            return                    
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2:
            return                    
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3:
            return                    
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            case 4:
            return                    
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5:
            return                    
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6:
            return                    
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7:
            return                    
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8:
            return                    
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9:
            return                    
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10:
            return                    
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            case 11:
            return                    
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            case 12:
            return                    
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            case 13:
            return                    
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";
            default: return "None";
            
        
                
        }        
    }

    public static void pressedEnter(String userInput, Scanner scan){
        checkEnterInsideMethod(userInput, scan);
    }

    private static void checkEnterInsideMethod(String userInput, Scanner scan) {
        if (userInput.equals("")){
            System.out.println("Pressed enter");
        }
        else{
            System.out.println("Please press enter if you are ready or press 'q' to quit the game.");
            String userQuit = scan.nextLine();
            if (userQuit.equals("q")){
                System.out.println("Quiting game...");

                // Handle exception
                try {
                
                Thread.sleep(2000); // wait before quiting game
                    
                } catch (Exception e) {
                    System.out.println("Cant wait...");
                }
                System.exit(0);
            }
            else if (userQuit.equals("")){
                System.out.println("Pressed enter");
                return;
            }
            else{
                checkEnterInsideMethod(userInput, scan);
            }
        }
    }

    public static void drawRiver(Scanner scan, int yourMatches, int computerMatches, String userCard, String pcCard) {
        for (int i = 1; i <= 5; i++) {
            String cardToDraw = randomCard();
            System.out.println();

            //Check matches
            checkMatches(cardToDraw, yourMatches, computerMatches, userCard, pcCard);

            System.out.println(i + "#\n" + cardToDraw);
            if (i == 5) {
                String continueAfterRiver = scan.nextLine();
                if (continueAfterRiver.equals("")){
                    return;
                }
                else{
                    System.out.println("Press enter");
                }
            }
            pressedEnter(cardToDraw, scan);
        }
        
    }

    public static void checkMatches(String cardToDraw, int yourMatches, int computerMatches, String userCard, String pcCard) {
        if (cardToDraw.equals(userCard)){
            yourMatches++;
        }
        else if(cardToDraw.equals(pcCard)) {
            computerMatches++;
        }
    }

    public static void checkWinner(int yourMatches, int computerMatches) {
        if (yourMatches > computerMatches){
            System.out.println("You won!");
        }
        else if(computerMatches > yourMatches){
            System.out.println("Pc won!");
        }
        else if (yourMatches == computerMatches){
            System.out.println("Everyone won!");
        }
    }
}
