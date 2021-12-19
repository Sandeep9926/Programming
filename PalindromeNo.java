package programming.practice;

public class PalindromeNo 
{
	public static void main(String[] args) 
	{
		int num=151,temp,rem;
		int rev=0;
		
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
		    rev=rev*10+rem;
		    temp=temp/10;
			
		}
		if(rev==num)
		{
			System.out.println(num+"is palindrome no");
		}
		else
		{
			System.out.println(num+"is not palindrome no");
		}
		
	}

}
