package javasessions;

public class GreatestNumberOutofFour {

	public static void main(String[] args) {
     
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;
		
		if (a>b && a>c && a>d) {
			System.out.println("the greatest:" + a );
		}else if(b>c && b>d) {
			System.out.println("the greatest:" + b );
		}else if(c>d) {
			System.out.println("the greatest:" + c );

		}else {
			System.out.println("the greatest:" + d );
		}
		
	}

}
