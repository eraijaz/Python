import java.util.Scanner;

public class LaunchExcept3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("welcome to division performing application");
			System.out.println("Enter the first number to divide");
	        int a =sc.nextInt();
	        System.out.println("Enter the second number");
	        int b=sc.nextInt();
	        int r=a/b; // if exception occurs b=0 control will go to catch block
	        System.out.println("The result is:"+r);
		}
		catch (ArithmeticException e) 
		{
		
			System.out.println("second number must be greater than zero");
	        
		}
		try {
	        System.out.println("please enter size of an array");
	        int size =sc.nextInt();
	        int ar[]=new int [size];
	        System.out.println("Enter the element to be added in array");
	        int element=sc.nextInt();
	        System.out.println("enter the position at which element has to be inserted");
	        int pos=sc.nextInt();
	        ar[pos]=element;
	        System.out.println(ar[pos]);
		}
		
		catch(NegativeArraySizeException e)
		{
		System.out.println("Enter the positive size of array");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter valid position of array");
		}
		catch(Exception e)
		{
		System.out.println("please enter the valid input");
		}

	}

}
