package day6;

public class compare2 {
	public static void main (String[]args) {
		int a = 40;
		int b =30;
		int c = 35;
		if (a<b&&a<c) {
			System.out.println(a+"is Maximum");
		}
		else if (b<c&&b<a) {
			System.out.println(b+"is minimum");
		}
		else if (c<a&&c<b){
			System.out.println(c+ "is minimum");
		}


		else {
			System.out.println("invalid");
		}
		
	}
	

}
