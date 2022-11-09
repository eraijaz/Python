
import java.util.Scanner;
class InvalidUserException extends Exception
{					//CUSTOM EXCEPTION EXAMPLE
	public InvalidUserException(String msg)
	{
		
		super(msg);
	}
	
}


class Atm1
{
	private int accountNum=1111;
	private int password=2222;
	private int accN;
	private int pw;
	// method for taking input from user
	public void input()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter account number");
	 accN=sc.nextInt();
	 System.out.println("Enter the password");
	 pw=sc.nextInt();
	 
	 
	}
	//verification block
	public void verify() throws InvalidUserException
	{
		if (accountNum==accN &&password==pw)
		{
			System.out.println("collect cash");
		}
		else
		{
			
			  InvalidUserException iue=new InvalidUserException("invalid credentials");
			  System.out.println("try again"); throw iue;
			 
			//throw new InvalidUserException("Invalid credentials");
			
		}
	}
	
}
class bank
{
	public void intiate()
	{
		Atm1 a =new Atm1();
		try
		{
			
		
		a.input();
		a.verify();
		}
		catch (InvalidUserException e) 
		{
			try
				{
					System.out.println(e.getMessage());
				a.input();
				a.verify();
				}
			catch (InvalidUserException f)
					{
						try
						{
							System.out.println(f.getMessage());
							System.out.println("Card will be blocked after 2 attempts");
							a.input();
							a.verify();
						}
						catch (InvalidUserException g)
						{
							
							try 
							{
								System.out.println(g.getMessage());
								System.out.println("Card will be blocked after 1 attempts");
								a.input();
								a.verify();
							} catch (InvalidUserException h)
							{
								System.out.println("Card Blocked ");
							}
							
							
						}
						
					}
			
		
		
	}
}
}


public class Atm
{

	public static void main(String[] args)
	{
		bank b=new bank();
		b.intiate();
		

	}

}

