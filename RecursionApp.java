package ExceptinDemo;

import java.util.Scanner;
public class RecursionApp
{
public static int fact(int n)
{
	int f;
	if(n==1)
	f= 1;
	else
	f=fact(n-1) * n;
	return f;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" Enter a integer value..");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(fact(num));
	}
}
