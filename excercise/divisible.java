import java.util.Scanner;
class divisible
  {
    public static void main(String args[])
    {
      int num;
      Scanner p=new Scanner(System.in);
      System.out.print("Enter any value: ");
      num=p.nextInt();
      if(num%5==0&&num%11==0)
        System.out.println(num+"Is divisible by 5 and 11");
      else
        System.out.println(num+"Is not divisible by 5 and 11");
    }
  }