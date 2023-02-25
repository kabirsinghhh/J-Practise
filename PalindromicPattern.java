import java.util.Scanner;
public class PalindromicPattern{
	public static void main ( String args [] ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number of rows : ");
	int r = sc.nextInt();
	for(int i = 1 ; i <= r ; i++ ){
		for(int sp = 1 ; sp <= r-i ; sp ++){
			System.out.print(" ");
		}
		for(int n = i ; n >= 1 ; n-- ){
			System.out.print(n);
		}
		for(int n = 2 ; n <= i ; n++){
			System.out.print(n);
		}	
		System.out.println();

	}
		for(int i = r-1 ; i >= 1 ; i-- ){
                for(int sp = 1 ; sp <= r-i ; sp ++){
                        System.out.print(" ");
                }
                for(int n = i ; n >= 1 ; n-- ){
                        System.out.print(n);
                }
                for(int n = 2 ; n <= i ; n++){
                        System.out.print(n);
                }
                System.out.println();

        }
				}
		}

