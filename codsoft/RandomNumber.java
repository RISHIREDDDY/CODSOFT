package codsoft;
import java.util.random.*;
import java.util.*;
public class RandomNumber{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);//obj = object instantation
        int score = 0;
        int rounds = 0;
        String playAgain = "y";
        System.out.print("Enter Random Number :");
        while(playAgain.equalsIgnoreCase("y"))
        {
            score = score+playGame(obj);//it will be incremented after conditions are met!
            rounds++; //counts rounds after increment of score!
            System.out.print("if your willing to play then enter (y) else, enter (n) :");
            playAgain = obj.nextLine();
        }
        System.out.println("Number of rounds won -> "+rounds+" "+"Score ->"+score);
    }
    public static int playGame(Scanner obj)
    {
        int Attempt = 0; 
        int maxAttempt = 10;//total no.of attempts
        Random random = new Random();
        int numToguess = random.nextInt(100)+1;
        while(Attempt<maxAttempt)
        {
            int guess;
            try{
                guess = Integer.parseInt(obj.nextLine()); 
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid number is entered !");
                System.out.println("Range is between (1-100) !");
                continue;
            }
            Attempt++; //after conditions are met it will be incremented!
            if(guess<1||guess>100)
            {
                System.out.println("enter number between 100");
            }
            else if(guess< numToguess)
            {
                System.out.println("it is too low");
            }
            else if(guess>numToguess)
            {
                System.out.println("it is too high");
            }
            else{
                System.out.println("you have passed this game !"+" "+" in this attempts"+" "+ Attempt);
                return maxAttempt - Attempt + 1;
            }
        }
        System.out.println("sorry you have passes all the chances"+ numToguess);
        return 0;
    }
}
