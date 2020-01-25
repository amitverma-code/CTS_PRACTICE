import java.util.Scanner;
public class Spvalue{
public static void main(String args[]){
System.out.println("how many number you want to insert");
Scanner sc = new Scanner(System.in);
int k=0;
int n= sc.nextInt();
int [] arr = new int[n];
for(int i=0; i<arr.length;i++)
{
System.out.println("enter numbers");
arr[i] = sc.nextInt();

}

System.out.println("enter number you want to search");
int x = sc.nextInt();
sc.close();
for(int i=0; i<arr.length;i++)
{
if (arr[i]== x)
{
System.out.println("yes present");
k=1;
}
}
if(k==0){
System.out.println("not present");


}



}



}