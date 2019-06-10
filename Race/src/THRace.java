
public class THRace {
	public static void main(String [] args) {
		
		System.out.printf("ON YOUR MARK, GET SET %nBANG !!!!! %nAND THEY'RE OFF !!!!!%n%n");
		
		int time = 0;
		THRaceFunc moves = new THRaceFunc(); //Calling instance variable for moving Tortoise and Hare
		
		int race = 0; //True or False Variable
		while(race == 0) { // Stops game once Tortoise, Hare, or Both Reaches 70
			System.out.printf("Time: %d%n%n", time);
			
			int x = moves.moveTortoise(time);
			int y = moves.moveHare(time);
			
			// Tortoise Track
			for(int j = 0; j < x; j++) {
				if(time == 0) {
					System.out.printf("B" + " ");
					break;
				}
				else if(j != x-1) System.out.printf("  ");
				else if (x == y) {
					System.out.println("OUCH!!");
					System.out.printf("B" + " ");
				}
				else if (j == x-1) System.out.printf("T" + " ");
			}
			System.out.println();
			for(int i = 0; i < 70; i++) { // Prints Board with 70 Spaces
				System.out.printf("_" + " ");
			}
			System.out.printf("%n%n");
			
			
			// Hare Track
			for(int k = 0; k < y; k++) {
				if(time == 0) {
					System.out.printf("B" + " ");
					break;
				}
				else if (x == y) {
					System.out.printf("B" + " ");
				}
				else if(k != y-1) System.out.printf("  ");
				else if (k == y-1) System.out.printf("H" + " ");
		}
			System.out.println();
			for(int i = 0; i < 70; i++) { // Prints Board with 70 Spaces
				System.out.printf("_" + " ");
			}
		
			System.out.printf("%n%n"); // Space between Board and Time

			
		//	System.out.printf("%nHare Movement: %d%n", moves.getHare()); *Error Checking Hare*
		//	System.out.printf("Tortoise Movement: %d%n", moves.getTortoise()); *Error Checking Tortoise*
			if(x >= 70) {
				race = 1;
				System.out.println("TORTOISE WINS!!! YAY!!!");
				break;
			}
			else if(y >= 70) {
				race = 1;
				System.out.println("Hare wins. Yuch.");
				break;
			}
			else if((x & y) == 70){
				race = 1;
				System.out.println("TIE!!!");
				break;
			}
			time++;
		}
		System.out.printf("Time Elapsed = %d%s", time, " seconds");
	}
}
