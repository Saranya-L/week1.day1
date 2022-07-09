package week1.day1;

public class IsPrimeorNot {

	
	public static void main(String[] args) {
		
		int num=37;
		int Rem;
		int i; 
		for(i=2;i<=(num-1);i++)
		{
			Rem=num%i;
			if(Rem==0) {
				System.out.println("Not a prime number");
				break;
			}
			
		}
		if(i==num)
		{
			System.out.println("Prime Number");
			}
		}
	}

