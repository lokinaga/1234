package day6;

public class conditionwithargs {
	public static void main (String[]args) {
		String a =args[0];
		int b= Integer.parseInt(a);
		if (b>=0) {
			System.out.println("positive");
			
		}
		else {
			System.out.println("Negative");
		}
		
		
		
	}

}
