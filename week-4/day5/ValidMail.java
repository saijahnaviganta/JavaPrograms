import java.util.Scanner;
class ValidMail
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int acount=0,scount=0;
      System.out.println("Enter E-mail id");
      String email=sc.next();
      for(int i=0;i<email.length();i++)
        {
          char ch=email.charAt(i);
          if(ch>='a'&&ch<='z')
          {
            acount++;
          }
          else 
            scount++;
        }
      if(acount>1&&scount>1)
      {
        System.out.println("Valid email id");
      }
      else 
        System.out.println("Invalid email id");
    }
  }