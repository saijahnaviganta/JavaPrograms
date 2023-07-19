import java.util.Scanner;
class DeleteElement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]={3,5,7,6};
      System.out.println("Enter the position where we want to delete element");
      int pos=sc.nextInt();
      for(int i=0;i<a.length-1;i++)
        {
          if(i==pos)
          {
        a[i]=a[i+1];
      }
            else if(i>pos)
            {
              a[i]=a[i+1];
            }
          else 
              continue;
        }
      System.out.println("Elements after deleting");
      for(int i=0;i<a.length-1;i++)
        {
          System.out.println(a[i]);
        }
  }
  }