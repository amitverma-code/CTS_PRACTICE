import java.util.Scanner;
public class Avg{
public static void main(String[] args)
{
int a,b,c,d;
Scanner sc= new Scanner(System.in);
System.out.println("enter first num");
a = sc.nextInt();
System.out.println("enter second num");
b = sc.nextInt();
System.out.println("enter third num");
c = sc.nextInt();
sc.close();
d= (a+b+c)/3;
System.out.println("avg of the number is.."+d);
}
}