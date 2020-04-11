package controlstatements;
import java.util.*;

public class Datatypes_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter first number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Please enter second number: ");
		Scanner sc_2 = new Scanner(System.in);
		int number2 = sc.nextInt();
		
		int largerNumber = number>=number2 ? number : number2;
		int smallerNumber = number>=number2 ? number2 : number;
		

		
		for(int i = smallerNumber; i <= largerNumber; i++) 
		{
			System.out.println(i + "     " + i*i + "     " + i*i*i);
		}
	}

}
