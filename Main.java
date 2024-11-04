import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int sum = 0;
    while ((num != -1))
    {
      System.out.print("Enter a number (Type -1 to stop): ");
      num = sc.nextInt();
      sum += num;
    }
    sum++;
    System.out.println("Sum: " + sum);

    //Problem 2
    num = 0;
    int max = Integer.MIN_VALUE;
    int i = 0;
    System.out.print("How many numbers do you want to input?: ");
    int count = sc.nextInt();
    while ((i < count))
    {
      System.out.println("Enter a number: ");
      num = sc.nextInt();
      if (num > max)
      {
        max = num;
      }
      i++;
    }
    System.out.println("Max: " + max);

    //Problem 3
    System.out.print("Enter a string: ");
    String str1 = new String(sc.nextLine());
    i = 0;
    while (i < str1.length())
    {
      if (i < str1.length()-1)
      {
        System.out.print(str1.substring(i, i+2));
      }
      else if (i == str1.length()-1)
      {
        System.out.print(str1.substring(i));
      
      i += 3;
      }
    }
  }
}
