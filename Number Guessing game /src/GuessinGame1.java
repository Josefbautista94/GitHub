import java.util.*;
public class GuessinGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int secretNumber;
   secretNumber = (int) (Math.random () * 20 + 1);
   //System.out.print("For debugging purposes the secret number is: " + secretNumber);
   
   Scanner keyboard = new Scanner (System.in);
   int guessedNumber;
   do {
	   System.out.print("Please enter a random number: " );
	   
	   guessedNumber = keyboard.nextInt();
	   System.out.println("The Number you choose is : " + guessedNumber);
	   
	   if (guessedNumber == secretNumber) {
		   System.out.print("Aye You guessed the number correctly");
	   }
	   else if (guessedNumber < secretNumber) {
		   System.out.println("Sorry try again! Your number is too low!");
	   }
	   else if (guessedNumber > secretNumber) {
		   System.out.println("Try again bud your number was too high!");
	   }
	   
   } while (guessedNumber != secretNumber);
	}

}
