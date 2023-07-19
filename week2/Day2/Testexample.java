/*write a Java program to track the performance of a basketball team throughout a season.
 Implement an array to store the team's scores and the corresponding opposing team's scores for each game and 
 calculate various statistics, such as the average score, highest score, and lowest score. Additionally, the program should display the number of games won and lost. 
 Consider a game won if the team scores more points than the opposing team and lost if the team scores fewer points. If the scores are equal, 
 it can be considered a tie or handled as per the specific requirements of the program.
 
Sample Input:
 
Enter the number of games played: 4 
Enter the scores for each game: 
Game 1 - Team's Score: 85 
Game 1 - Opposing Team's Score: 70 
Game 2 - Team's Score: 92 
Game 2 - Opposing Team's Score: 80 
Game 3 - Team's Score: 78 
Game 3 - Opposing Team's Score: 82 
Game 4 - Team's Score: 90 
Game 4 - Opposing Team's Score: 95 
  
 
Sample Output:
 
Average Score: 86.25 
Highest Score: 95 
Lowest Score: 70 
Games Won: 2 
Games Lost: 2 */
import java.util.Scanner;
class Testexample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of games played");
      int num=sc.nextInt();
      int team[]=new int[num];
      int oppositeteam[]=new int[num];
      System.out.println("Enter the score for each game");
      for(int i=0;i<team.length;i++)
        {
         team[i]=sc.nextInt();
          oppositeteam[i]=sc.nextInt();
        }
      for(int i=0;i<team.length;i++)
        {
      System.out.println("Game"+(i+1)+"Team score is:"+team[i]);
          System.out.println("Game"+(i+1)+"Opposite Team score is:"+oppositeteam[i]);
        }
    }
  }