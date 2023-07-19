/*1. Rock Paper Scissors Program : Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/
import java.util.Scanner;
class RockPaperScissor
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter user value");
      char user=sc.next().charAt(0);
      System.out.println("enter computer value");
      char computer=sc.next().charAt(0);
      if((user=='r'&&computer=='p')||(user=='R'&&computer=='P'))
      {
        System.out.println("computer is the winner");
      }
      else if((user=='p'&&computer=='r')||(user=='P'&&computer=='R'))
      {
        System.out.println("user is the winner");
      }
      else if((user=='r'&&computer=='s')||(user=='R'&&computer=='S'))
      {
        System.out.println("user is the winner");
      }
      else if((user=='s'&&computer=='R')||(user=='S'&&computer=='R'))
      {
        System.out.println("computer is the winner");      
      }
     else if((user=='p'&&computer=='s')||(user=='P'&&computer=='S'))
    {
     System.out.println("computer is the winner");
    }
   else if((user=='s'&&computer=='p')||(user=='S'&&computer=='P'))
{
  System.out.println("user is the winner");
}
else{
  System.out.println("it is a invalid");
}
}
      }
