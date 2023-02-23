import java.util.Scanner;
public class ComputeSum{
	public static int sum(int n){
		int n2=n,summ=0;
		while(n!=0){
			int rem = n % 10;
			summ = summ + rem ;
			n = n / 10 ;
		}
		return summ;

	}
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.print("This Proramme will compute sum of the digits in an Integer \nEnter any integer : ");
	int n=sc.nextInt();
	System.out.print("sum is : "+sum(n));

				}
		}

