import java.util.Scanner;
class Wordcount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();
      String s1[]=s.split(" ");
      for(int i=0;i<s1.length;i++)
        {
          System.out.println("Length of"+s1[i]+"is"+s1[i].length());
        }
    }
  }