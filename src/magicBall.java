import java.util.Random; // imports a randomiser
import java.util.Scanner; // imports scanner

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Enter your question");

        Scanner scan = new Scanner(System.in); // Constructor which allows user to type in console. Scanners scans through text.
        scan.next(); // this gets the next word from where the console due to the "System.in", untill user press enter
        scan.close(); // this lets java know we wont need the scanner anymore

        Random randomGen = new Random();
        int rand = randomGen.nextInt(8);


        // if else statement which will print a line if their rand number is called
        if(rand == 0) {
            System.out.println("As i see it yes.");
        } else if (rand == 1) {
            System.out.println("Signs point to yes.");
        } else if (rand == 2) {
            System.out.println("Don't count on it.");
        } else if (rand == 3) {
            System.out.println("Reply hazy, please try again");
        } else if (rand == 4) {
            System.out.println("Outlook not so good.");
        }  else if (rand == 5) {
        System.out.println("HELL YEAH!");
        } else if (rand == 6) {
            System.out.println("HELL NO!");
        } else if (rand == 7) {
            System.out.println("With a little bit more persistence, yes!");
        }





    }
}
