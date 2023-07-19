import java.util.Scanner;
class Longwordshtwd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int lar=s[0].length();
      String word="";
      for(int i=0;i<s.length;i++)
        {
          if(lar<s[i].length())
          {
            lar=s[i].length();
            word=s[i];
          }
        }
      System.out.println("The largest word in the array is:"+word);
    }
  }