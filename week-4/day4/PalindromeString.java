import java.util.Scanner;
class PalindromeString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=sc.next();
      String rev="";
      for(int i=st.length()-1;i>=0;i--)
        {
          rev=rev+st.charAt(i);
        }
      System.out.println(rev);
      if(st.equals(rev))
      {
        System.out.println("It is palindrome");
      }
      else
        System.out.println("It is not a palindrome");
    }
  }
  