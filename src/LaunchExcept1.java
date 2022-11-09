import java.util.Scanner;


public class LaunchExcept1 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to division performing application");
		System.out.println("Enter the first number to divide");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int r=a/b; // if exception occurs b=0 control will go to catch block
        System.out.println("The result is:"+r);
		}
		catch(Exception e)
		{
        System.out.println("Thank you for using our"
        		+ " application second number must be greater than zero");
		}
	
	}

}
