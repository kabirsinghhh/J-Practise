public class Break{
	public static void main(String [] args){
		// just using break keyword
		int i=1;
		while(i<=10){
			if(i>=5){
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("out of while loop using break ");
	}
}
