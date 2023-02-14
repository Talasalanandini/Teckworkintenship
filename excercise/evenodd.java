import java.util.Scanner;
class evenodd
  {
    public static void main(String args[])
    {
      int num;
      Scanner d=new Scanner(System.in);
      System.out.print("Enter value for num: ");
      num=d.nextInt();
      if(num%2==0)
        System.out.println(num+"is even");
      else
        System.out.println(num+"is odd");
    }
  }