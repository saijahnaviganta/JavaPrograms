class Nesteddif
  {
    public static void main(String args[])
    {
      String country="India";
      int age=18;
      if(country.equals("India"))
      {
        if(age>=18)
        {
          System.out.println("Eligible to vote");
        }
        else 
          System.out.println("Note eligible to vote");
      }
      else 
        System.out.println("person not from india");
    }
  }