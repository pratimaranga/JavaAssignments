
package Nov4_2020;
import java.util.*;

public class ConditionaloperatorsQues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Please Enter the second number : ");
		int b =sc.nextInt();
		
		System.out.println("Please Enter the third number : ");
		int c =sc.nextInt();
		
		if( (a>b) && (b>c))
			System.out.println("Number " + a + " is greatest number" );
		else if (b>c )
			System.out.println("Number " + b + " is greatest number");
		else
			System.out.println( c + " is the greatest number");
		
		System.out.println("------------");
		
		System.out.println("Please Enter a number to check if it is positive  number or negative number");
		double num=sc.nextDouble();
		
		if(num>0)
			System.out.println("Entered number is positive");
		else if (num<0)
			System.out.println("Entered number is negative");
		else
			System.out.println("Entered number is neither positive nor negative");
		
	}

}
