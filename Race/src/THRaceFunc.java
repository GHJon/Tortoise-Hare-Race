import java.util.Random;

public class THRaceFunc {
	int tortoise = 0;
	int hare = 0;
	Random randomnumbers = new Random();
	
	public int getTortoise(){
		return tortoise;
	}
	public int getHare(){
		return hare;
	}
	public int moveTortoise(int time) {
		int rngT = randomnumbers.nextInt(10);
		if(time == 0) {
			tortoise = 1;
		}
		else if(rngT <= 4) {
			// Move 3 squares to the right
			tortoise += 3;
		}
		else if (rngT <= 6) {
			// Move 6 squares to the left
			tortoise -= 6;
		}
		else if (rngT <= 9) {
			// Move 1 square to the right
			tortoise++;
		}
		if(tortoise < 1) {
			tortoise = 1;
		}
		if(tortoise > 70) {
			tortoise = 70;
		}
		return tortoise;
	}
	public int moveHare(int time) {
		int rngH = randomnumbers.nextInt(10);
		if(time == 0) {
			hare = 1;
		}
		else if (rngH <= 3) {
			// Move 9 squares to the right
			hare += 9;
		}
		else if (rngH == 4) {
			// Move 12 squares to the left
			hare -= 12;
		}
		else if (rngH <= 7) {
			// Move 1 square to the right
			hare++;
		}
		else if (rngH <= 9) {
			// Move 2 squares to the left
			hare -= 2;
		}
		if(hare < 1) {
			hare = 1;
		}
		if(hare > 70) {
			hare = 70;
		}
		return hare;
	}
}
