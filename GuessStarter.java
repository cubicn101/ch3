import java.util.Random;
import java.util.Scanner;

   public class GuessStarter {
       public static void main(String[] args) {
       //  pick a random number
       
       System.out.println("I'm thinking of a number between 1 and 100");
       System.out.println(" (Including both). Can you guess my number?");
      
     
      
       Random random = new Random();
       int number = random.nextInt(100) + 1;
       Scanner in = new Scanner(System.in);
       
       int guess = in.nextInt();
       //IMPORTANT!!!!
       int off = number - guess;
       
      
       System.out.println("Your guess is"+ guess + ".");
       System.out.println("The number I was thinking of is:" + number);
       System.out.println("You were off by:" + off);
       
  
}
}
