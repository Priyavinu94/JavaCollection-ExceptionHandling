/* Given two x & y as input, you have to compute x/y. If x and y are not int or if y is zero, Exception will occur and you have to report it
 *  If input numbers are not integers : java.util.InputMismatchException 
 *  If y is zero : java.lang.ArithmeticException: / by zero
 */
package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsQuestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Please enter 2 integers");

		try {
			
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("Value of x/y : " + (x / y));
			
		} catch (InputMismatchException typeMismatch) {
			
			System.out.println("Enter integer values only!");
			typeMismatch.printStackTrace();
			
		} catch (ArithmeticException arithExp) {
			
			System.out.println("Division by zero not possible");
			arithExp.printStackTrace();
			
		} finally {
			sc.close();
		}

	}

}
