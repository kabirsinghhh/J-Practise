import java.util.Scanner;
public class HollowRhombus{
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of row : ");
	int r = sc.nextInt();
	System.out.println("Enter size of column : ");
	int c = sc.nextInt();
	for( int i = 1 ; i<=r ; i++ ){
		for( int sp = 1 ; sp <= r-i+1 ; sp++ ){
			System.out.print("  ");
		}
		for( int st=1;st<=c ; st++ ){
			if(i==1 || i==r || st ==1 || st ==c){
			System.out.print("* ");
			}
			else {
			System.out.print("  ");
			}


		}
			System.out.println();
				}
		}
}
