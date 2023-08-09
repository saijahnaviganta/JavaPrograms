class Wrapper
  {
    public static void main(String args[])
    {
      int x=20;
      Integer i=Integer.valueOf(x);
      Integer y=x;//implicitly converted by the compiler
      System.out.println(x+" "+i+" "+y);
      int z=y;
      System.out.println(z);
    }
  }



