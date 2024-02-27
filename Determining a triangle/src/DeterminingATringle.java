import java.util.Scanner;

public class DeterminingATringle {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = in.nextDouble();
		System.out.println("Enter b: ");
		double b = in.nextDouble();
		System.out.println("Enter c: ");
		double c = in.nextDouble();
		
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			if(a==b && b==c)
				{System.out.println("The triangle is equilateral!");}
				 if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
				{
					 System.out.println("The triangle is right!"); 
				}
				if(a!=b && b!=c && c!=a) 
				{
					System.out.println("The triangle is scalene!");
				}
				 if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
				{
					 System.out.println("The triangle is isoceles!");	 
				}
			
		}
		else
		{
			System.out.println("The triangle doesn't exist!");
		}
		
	}

}
