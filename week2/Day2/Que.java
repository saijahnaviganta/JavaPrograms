/*Q)Given an array of integers and a positive integer , determine the number of (i+j) pairs where (i<j) and  ar[i]+ar[j] is divisible by K.
and let the user deside size of array (int n: the length of array ) and take input (int ar[n]: an array of integers) and take input for 
the integer divisor (int k: the integer divisor) 
ar=[1,2,3,4,5,6]
k=5
Three pairs meet the criteria: [1,4],[2,3], and [4,6].
Sample Input:
Enter size of array : 6
Enter element in array ar[1]: 1
Enter element in array ar[2]: 3
Enter element in array ar[3]: 2
Enter element in array ar[4]: 6
Enter element in array ar[5]: 1
Enter element in array ar[6]: 2
Enter an integer divisor : 3
Sample Output
The total pairs are: 5*/
import java.util.Scanner;
class Que
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter elements into array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        } 
      System.out.println("Enter the integer divisor");
      int k=sc.nextInt();
      int count=0;
        for(int i=0;i<a.length;i++)
          {
            for(int j=i+1;j<a.length;j++)
              {
                if(i<j)
                {
                  if(a[i]+a[j]%k==0)
                  {
                    count++;
                  }
                }
              }
          }
      System.out.println("The total pairs are:"+countn );
    }
  }
/*Input Format    (check how many 1000,500 and 100 notes in the given amount)
4500
 
Entered amount should be positive and only Integers.
 
Sample Input 0:
 
4600
 
Sample Output 0:
 
5
Sample Input 1:
 
950
 
Sample Output 1:
 
Entered Amount must be multiples of 100*/