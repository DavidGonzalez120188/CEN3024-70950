/**
 * 
 */
package fibonacci;

import java.util.Scanner;

/**
 * @author David
 *
 */
//Fibonacci Series using Recursion / Interative 
public class  fibonacci {
	
private static fibonacci fib;

static int fib_Iterative(int n)
{
   int f1 = 1;
   int f2 = 1;
   
   for (int i = 3; i <= n; i++){
	   int f2_aux = f1;
	   f1 = f2 + f1 ;
	   f2 = f2_aux; //old value of f1
   }
   
   return f1; 
}

static int fib_recursive(int n) {
	if (n == 1 || n == 2)
		return 1;
	else return fib_recursive(n-2) + fib_recursive(n-1);
}

//Display and print running time
public static void dispTime() {
long startTime = System.nanoTime();
System.out.println("time = " + (System.nanoTime() - startTime) + " nanosecs.");
}

public static void main(String[] args) {
fib = new fibonacci();
Scanner input = new Scanner(System.in);

System.out.println("Enter a value for n: ");
int n = input.nextInt();

System.out.println("Iterative version:");
long startTime = System.nanoTime();
System.out.println(fib.fib_Iterative(n));
System.out.println("time = " + (System.nanoTime() - startTime) + " nanosecs.");

System.out.println("Recursive version:");
startTime = System.nanoTime();
System.out.println(fib.fib_recursive(n));
System.out.println("time = " + (System.nanoTime() - startTime) + " nanosecs.");
}
}


