import java.util.Scanner;
class CountOfWords
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=1;
      System.out.println("Enter string");
      String str=sc.nextLine();
      String st[]=str.split(" ");
      for(int i=0;i<str.length()-1;i++)
        {
          if(str.charAt(i)==' ')
          {
            count++;
          }
        }
      System.out.println("Count of words are:"+count);
    }
  }