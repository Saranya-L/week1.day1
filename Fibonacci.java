package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int c;
System.out.println(a);
System.out.println(b);
//to print first 11 keep count as 9 since already 2 numbers are printed
for(int count=1;count<=9;count++) 
{
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
}
	}

}
