/*1.WAP to find total number of alphabets, digits or special     character in a string.*/
class SpeCharnum
  {
    public static void main(String args[])
    {
      String str="Bitlabs@123";
      int digit=0;
      int s=0;
      int a=0;
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
      {
        a++;
      }
      else if(ch>='0' && ch<='9')
      {
        digit++;
      }
      else
        s++;
    }
      System.out.println("Count of alphabets in string are:"+a);
      System.out.println("Count of digits in string are:"+digit);
      System.out.println("Count of special characters in string are:"+s);
  }
  }