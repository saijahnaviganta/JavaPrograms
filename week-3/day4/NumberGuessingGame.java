/*Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.*/
 import java.util.Scanner;
class NumberGuessingGame
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      System.out.println("Enterr certain range");
      int range=sc.nextInt();
      do
        {
      System.out.println("Enter user guessing number");
      int user=sc.nextInt();
          for(int i=0;i<range;i++)
            {
              if(user<=range)
              {
                System.out.println("your guess is correct");
              }
            }
          System.out.println("your guess is incorrect");
          System.out.println("do you want to continue:(y/n)");
          option=sc.next().charAt(0);
        }while(option=='Y'||option=='y');
    }
  }