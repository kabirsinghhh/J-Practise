import java.util.Scanner;
public class DiamondPattern{
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("This programme will print Diamond \nEnter value of Rows : ");
	int r = sc.nextInt();
	for(int i = 1 ; i <= r; i++){

		for (int sp = 1 ; sp <= r - i +1 ; sp ++){
			System.out.print("  ");
		}
		for (int st =1 ; st <= i+i -1 ; st++){
			System.out.print(" *");
		}
		System.out.println();
	}
		 for(int i = r-1 ; i >= 1; i--){

                for (int sp = 1 ; sp <= r - i +1 ; sp ++){
                        System.out.print("  ");
                }
                for (int st =1 ; st <= i+i -1 ; st++){
                        System.out.print(" *");
                }
                System.out.println();
		 }

				}
		}

