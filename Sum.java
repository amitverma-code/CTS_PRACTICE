import java.util.Scanner;
public class Sum{
public static void main(String[] args)
{
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("enter first num");
a = sc.nextInt();
System.out.println("enter second num");
b = sc.nextInt();
sc.close();
c= a+b;
System.out.println("Sum of the number is"+c);
}
}