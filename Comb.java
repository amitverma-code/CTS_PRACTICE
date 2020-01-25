import java.util.Scanner;
public class Comb{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter num");
int arr[] = new int[3];
for(int i=0; i<3 ; i++)
{
arr[i] = sc.nextInt();
}
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
for (int z = 0; z < 3; z++)
{
if (x != y && y != z && z !=x)
{
System.out.println(arr[x] + "" + arr[y] + "" + arr[z]);
}
}
}
}
}
}