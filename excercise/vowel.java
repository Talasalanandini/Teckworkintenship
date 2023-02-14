import java.util.Scanner;
class vowel
  {
    public static void main(String args[])
    {
      char ch;
      Scanner d=new Scanner(System.in);
      System.out.print("enter value of ch:");
      ch=d.next().charAt(0);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        System.out.println(ch+"is an vowel");
      else
        System.out.println(ch+"is not an vowel");
    }
  }