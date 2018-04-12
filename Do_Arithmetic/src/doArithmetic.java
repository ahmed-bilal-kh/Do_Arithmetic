import java.util.*;

public class doArithmetic {
	
	public static void main(String[ ] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
	
		int int1;	
		int int2;
		int sum;
		int difference;
		int quotient;
		int product;
		int remainder;
		
		System.out.println("Enter the two operands:");
		
		int1 = keyboard.nextInt();
		int2 = keyboard.nextInt();
		sum = int1 + int2;
		difference = int1 - int2;
		quotient = int1 / int2;
		product = int1 * int2;
		remainder = int1 % int2;
		
		System.out.printf("The sum is %d \n", sum);
		System.out.printf("The difference is %d \n", difference);
		System.out.printf("The quotient is %d \n", quotient);
		System.out.printf("The product is %d \n", product);
		System.out.printf("The remainder is %d \n", remainder);
		
	}
}

