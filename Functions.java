import java.util.Scanner;

public class Functions{
	public static int calculateSum(int n1 , int n2 ){
	int sum = n1 + n2 ;
	return sum;
	}
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number 1 : ");
	int a = sc.nextInt();
	System.out.println("Enter number 2 : ");
	int b = sc.nextInt();
	System.out.println(calculateSum(a,b));
				}
	}
