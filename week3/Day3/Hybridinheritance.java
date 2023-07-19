class Grandfather
  {
    public void property()
    {
      System.out.println("having property");
    }
  }
class Father extends Grandfather{
  public void similarity()
  {
    System.out.println("having same similarities");
  }
}
class Son extends Father{
  public void study()
  {
    System.out.println("educated");
  }
}
class Daughter extends Father{
  public void smiling()
  {
    System.out.println("smiling");
  }
}
class Hybridinheritance
  {
    public static void main(String args[])
    {
      Daughter d=new Daughter();
      Son s=new Son();
      d.smiling();
      s.study();
      d.property();
      d.similarity();
    }
  }