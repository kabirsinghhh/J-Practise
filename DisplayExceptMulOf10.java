import java.util.Scanner;
public class DisplayExceptMulOf10{
	public static void main(String args[]){
		System.out.println("this program will display every numbers you enter except multiplies of 100 ...\nEnter '101' to end this program ");
		Scanner sc = new Scanner (System.in);
		while(true){
			System.out.print("Enter any number : ");
			int n= sc.nextInt();
			if(n%10==0){
				continue;
			}
			System.out.println(n);
			if(n==101){
				break;
			}
		}
	}
}


