import java.util.Scanner;
class Alphanumsp
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      int count=0,ncount=0,scount=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
          {
            count++;
          }
          else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
            ncount++;
            }
          else 
            scount++;
        }
      System.out.println("The alphabets in string are:"+count);
      System.out.println("The numbers in string are:"+ncount);
      System.out.println("The special characters in string are:"+scount);
    }
  }