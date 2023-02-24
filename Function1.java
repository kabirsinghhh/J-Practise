import java.util.Scanner;
public class Function1{
	public static void printTable(long num){
		for(long i = 1 ; i <= 10 ; i++ ){
	System.out.println( num + " x " + i + "= " + num*i );
		}
	return;

	}
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.print("This program will Return you the Table of nnumber you entered \n\nEnter any number : ");
			long n = sc.nextLong();
			printTable(n);
	}
		}

