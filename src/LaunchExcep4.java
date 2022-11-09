import java.util.Scanner;

class Alpha
{
	public void division()
	
	{
		try
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
		catch (ArithmeticException e) {
			System.out.println("Enter second number non zero");
		}
	}
}

	class beta
	{
		public void disp()
		{
			Alpha a= new Alpha();
			a.division();
		}
		
	}


public class LaunchExcep4 {

	public static void main(String[] args) {
		beta b=new beta();
		b.disp();
		

	}

}
