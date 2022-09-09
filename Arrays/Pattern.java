package arrays;

public class Pattern {
	
	public static void main(String[] args) {
	
		String s = "PROGRAMJAVA";
	
		for(int i = 0; i < s.length(); i++) {
		
			for(int j =0; j<s.length(); j++) {
			
				if(j == i || (j+i == s.length()-1)) System.out.print(s.charAt(j));
			
				else System.out.print(" ");
			}
			
			System.out.println();
		}
	
	}
}
