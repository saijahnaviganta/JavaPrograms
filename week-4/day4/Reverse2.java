import java.util.Scanner;
class Reverse2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String st[]=str.split(" ");
      String rev="";
    for(int i=st.length-1;i>=0;i--)
      {
        rev=rev+st[i];
      }
      System.out.println(rev);
    }
  }