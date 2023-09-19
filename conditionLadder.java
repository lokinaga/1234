package day6;

public class conditionLadder {
	public static void main (String[]args) {
		int a = 5;
		int b = 10;
int c= 15;
		
		//String d = args[0];
		//String e = args[1];
		//String f = args[2];
		//int a =Integer.parseInt(d);
		//int b = Integer.parseInt(e);
		//int c = Integer.parseInt(f);
	if (a>b&&a>c) {
		System.out.println(a+" "+"is the biggest num");
	}
	else if (b>c&&b>a) {
		System.out.println(b+" "+"is the biggest num");
	}
	else {
		System.out.println(c+" "+ "is the biggest number");
	}
	
	
	
	

}
}