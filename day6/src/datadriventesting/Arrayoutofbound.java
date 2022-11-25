package datadriventesting;

import java.nio.channels.AlreadyBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrayoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*try {
	int a=10;
	int b=0;
	int c=a/b;
}

catch(ArithmeticException e) {
	System.out.println(e);
	
}*/
//array out of bound
int a[]=new int [2];
try {
	a[0]=10;
	 a[1]=20;
	 a[2]=30;
	 a[3]=40;
}
	catch(AlreadyBoundException e)
{
		System.out.println(e);
}
		//input mismatch
		/*int a;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter an integer");
			a=sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println(e);
		}*/

		
}
}
