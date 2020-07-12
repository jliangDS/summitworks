package ExceptinDemo;
import java.util.*;
public class FirstExceptionApp {
	public static void main(String[] args) {		
		int a1[]={5,9,2,98,52,64,45,23};
		System.out.println("open the connection");
		System.out.println("enter two values");
		Scanner sc=new Scanner(System.in);	
		int a;
		try
		{
		a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a/b);
		/*System.out.println("enter index to access element from the array: enter below "+a1.length);
		int i=sc.nextInt();*/
		System.out.println(a1[4]);// trying to access element from the array
		}
		catch(InputMismatchException i)
		{
			System.out.println("invalid data enterd by the customer, please enter proper data");
		}
		catch(ArithmeticException a12)
		{
			System.out.println("tyring to divide with zero");
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("trying to access out of range of the array");
		}
			System.out.println("commit the trascation");
			System.out.println("close data base connection");
			System.out.println("close the session");
			System.out.println("clear cache memory");
			System.out.println("another statements, another methods,clases");
			sc.close();
			//int x=sc.nextInt();
	}
}
