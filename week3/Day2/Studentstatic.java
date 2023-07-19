class Studentstatic
  {
    String name;
    int rollnumber;
    static String clgname="kbn";
    public void display()
    {
      System.out.println(name+" "+rollnumber+" "+clgname);
    }
    public static void main(String args[])
    {
      Studentstatic st=new Studentstatic();
      st.name="jahnavi";
      st.rollnumber=20;
      Studentstatic st1=new Studentstatic();
      st1.name="swetha";
      st1.rollnumber=40;
      Studentstatic st2=new Studentstatic();
      st2.name="rajeswari";
      st2.rollnumber=50;
      st.display();
      st1.display();
      st2.display();
    }
  }