public class InvertedStar{
	public static void main(String args[]){
		int lines=5;
		for(int i = 1 ; i <= lines ; i++){
			for (int j = 1 ; j <= lines - i + 1 ; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
