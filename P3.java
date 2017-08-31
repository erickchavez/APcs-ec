import java.awt.Paint;

public class P3 {
 
	public static String  stars(int n) {
		String stars = "";
		 for(int num = 0; num < n ;num ++){
		// This prints the number of "*" in one line
			 for (int num2 = 0; num2 < num ;num2 ++) {
				  // this adds * into the empty string stars
				 stars += "*";
			 }
		// This adds a new line after the number of * in one line is finished.
			stars += "\n";
		}
		return stars;
		}
	
	 public static void main(String[] args) { System.out.println(stars(6));
	 }
}
