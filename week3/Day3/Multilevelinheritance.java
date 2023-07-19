class Animal
  {
    public void run()
    {
      System.out.println("ran fast");
    }
  }
class Lion extends Animal
  {
    public void roar()
    {
      System.out.println("roaring");
    }
}
class cub extends Lion{
  public void kill()
  {
    System.out.println("kill other animals");
  }
}
class Multilevelinheritance
  {
    public static void main(String args[])
    {
      cub c=new cub();
      c.kill();
      c.roar();
      c.run();
    }
  }