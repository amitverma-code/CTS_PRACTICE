import java.util.Scanner;
public class Strn{
public static void main(String[] args)
{
String str[]=new String[3];
System.out.println("enter names");
Scanner sc= new Scanner(System.in);

for(int i=0;i<str.length;i++)
{
  str[i]=sc.next();
}
for(int i=0;i<str.length;i++)
{
System.out.println(str[i]);
}
}
}