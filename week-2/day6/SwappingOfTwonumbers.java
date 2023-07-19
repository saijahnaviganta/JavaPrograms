class SwappingOfTwonumbers
  {
    public static void main(String args[])
    {
      int firstnumber=12, secondnumber=45;
      System.out.println("Before Swapping:"+firstnumber+" "+ secondnumber);
      firstnumber=firstnumber+secondnumber;
      secondnumber=firstnumber-secondnumber;
      firstnumber=firstnumber-secondnumber;
      System.out.println("After swapping:"+firstnumber+" "+secondnumber);
    }
  }