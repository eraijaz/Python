import java.util.Scanner;

class underAgeException extends Exception
{
	public underAgeException(String msg) 
	{
		super(msg);
	}
	
}
class overAgeException extends Exception
{
	public overAgeException(String msg) 
	{
		super(msg);
	}
}
class Lapp
{
	private int age;
	
	void input ()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		
		
	}
	void verify()throws overAgeException,underAgeException
	{
		if(age>=18 &&age<=60)
		{
			System.out.println("You are eligible");
		}
		else if(age<18)
		{
			throw new underAgeException("Age must be 18 or 18+");
		}
		else if(age>60)
		{
			throw new overAgeException("Age must be less or equal to 60");
		}
	}
	
	
}
class Rto1
{
	void intiate()
	{
		System.out.println("rto1");
		Lapp l=new Lapp();
	
		try {
			l.input();
			l.verify();
		} 
		catch (overAgeException e) 
		{
			
				System.out.println(e.getMessage());
				System.out.println("seems dead ");
			System.exit(0);
			
			
		} 
	
		catch (underAgeException g) 
		{
			System.out.println(g.getMessage());
			System.out.println("seems suspicious");
			System.exit(0);
			
		}
		}
		
}



public class Rto {

	public static void main(String[] args) 
	{
		Rto1 r=new Rto1();
		r.intiate();
	

	}

}
