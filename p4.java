
public class p4 {
	public static void main(String[] args) {
		System.out.println(coins(7));
	}
		public static int coins(int n){
			int coins = n; 					// making coins variable
			int amountFives = 0;			// counter for amount of 5 cent coins
			int amountTwos = 0;				// counter for amount of 2 cent coins
			// adds a five cent coin for every five cents that are in the value of money
			for(int i=5; i<=n; i+=5){ 
				amountFives += 1; 			// adds a five cent coin
				coins -= 5; 				// deducts 5 cents from the amount of coins
			}
			// if statement checks if remainder is divisible by two
			if (coins%2 == 0){
				amountTwos += coins/2;	// if remainder is divisible by two, then add amount of two cent coins that adds up to the remainder 
			} else if (coins%2 != 0){
				amountFives -= 1;  		// if not divisible by two, backtrack by subtracting a five cent coin and dividing the remaining amount of coins by two
				amountTwos += (coins+5)/2;
			}
			
			int total = amountFives + amountTwos;
			// if original value is equal to 1 or 3, then it is impossible to give change, and the if statement changes the total to -1 
			if (n == 1 | n == 3){ 
				total = -1;  
			}
			
			return total;

		}
	}
	



