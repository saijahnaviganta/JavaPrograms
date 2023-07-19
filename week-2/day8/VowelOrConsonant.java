//8.WAP to input any alphabet and check whether it is vowel or consonant.//.
import java.util.Scanner;
class VowelOrConsonant
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character:");
      char ch=sc.next().charAt(0);
      if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U'))
      {
        System.out.println("The given alphabet is a vowel");
      }
      else
        System.out.println("The given alphabet is a consonant");
    }
  }