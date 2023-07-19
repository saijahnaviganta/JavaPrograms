/*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39                                                            25 < 39                                                             25 <= 39*/
class Cmptwonum
  {
    public static void main(String args[])
    {
      int first=25,second=39;
      if(first!=second)
      {
      System.out.println("25!=39");
      }
      if(first<second)
      {
      System.out.println("25<39");
      }
       if(first<=second)
      { 
      System.out.println("25<=39");
      }
    }
  }