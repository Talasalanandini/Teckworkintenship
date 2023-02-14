import java.util.Scanner;
class positivenegative
  {
    public static void main(String args[])
    {
      int num;
      Scanner d=new Scanner(System.in);
      System.out.print("Enter value for num:");
      num=d.nextInt();
      if(num>0)
        System.out.println("The given number is positive");
      else
        System.out.println("The given number is negative");
      
    }
  }