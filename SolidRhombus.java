import java.util.Scanner;
public class SolidRhombus{
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("This program will print Solid Rhombus Pattern \nEnter value or rows : ");
	int r = sc.nextInt();
	System.out.println("Enter value of columns : ");
	int c = sc.nextInt();
	for(int i = 1 ; i<=r ; i++){
		for(int sp = 1 ; sp<=r-i+1 ; sp++){
			System.out.print("  ");
		}
		for(int st = 1 ; st <= c ; st++ ){
			System.out.print("* ");
		}
		System.out.println();
	}

				}
		}

