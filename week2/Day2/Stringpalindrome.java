import java.util.Scanner;
class Stringpalindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String a[]=str.split(" ");
      for(int i=0;i<a.length;i++)
        {
          String temp=a[i];
          String reverse="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              reverse=reverse+temp.charAt(j);
            }
          if(temp.equals(reverse))
          {
            System.out.print(temp+" ");
          }
        }
      String a2[]=temp;
     for(int i=0;i<a2.length;i++)
       {
      int large=a2[0].length;
      String word="";
      for(int j=0;j<a2.length-1;j++)
        {
          if(large<a2[i].length())
          {
            large=a2[i].length();
            word=a2[i];
          }
        }
      System.out.println("The largest palindrome word is"+word);
    }
  }
  }