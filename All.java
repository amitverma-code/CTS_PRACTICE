import java.util.Scanner;
public class All{
public static void main(String[] args)
{
int a,b,c,d,e,f;
Scanner sc= new Scanner(System.in);
System.out.println("enter first num");
a = sc.nextInt();
System.out.println("enter second num");
b = sc.nextInt();
sc.close();
c= a+b;
d=a-b;
e=a/b;
f=a%b;
System.out.println("sum of the number is.."+c);
System.out.println("sub of the number is.."+d);
System.out.println("Dev of the number is.."+e);
System.out.println("Mod of the number is.."+f);
}
}


























