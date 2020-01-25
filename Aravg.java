public class Aravg
{
public static void main(String[] args)
{
int avg;
int[] a = {1,2,23,3,3,3,2};
int t = 0;
for(int i=0; i<a.length; i++)
{
t = t+ a[i];
}
avg= t/ a.length;
System.out.print(avg+ "");
}
}