import java.util.Scanner;

class Alpha2
{
	public void division()
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to division performing application");
		System.out.println("Enter the first number to divide");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int r=a/b; 
        System.out.println("The result is:"+r);
		
	}
}

	class beta2
	{
		public void disp()
		{
			Alpha2 a= new Alpha2();
			a.division();
		}
		
	}



public class LaunchExcp5 {

	public static void main(String[] args) {
		try
		{
			
	
		beta2 b=new beta2();
		b.disp();
		}
		catch (ArithmeticException e) {
			System.out.println("handling in main ");
		}

	}

}
