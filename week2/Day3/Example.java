import java.util.Scanner;
class Example
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=sc.nextLine();
     String s1=st.replaceAll("[()]","");
      System.out.println(s1);
    }
  }