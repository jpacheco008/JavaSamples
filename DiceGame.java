/*Julio Pacheco and Jonathan Marcano 
 * Project 3-3
 * 
 * Game simulation
 */

import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner (System.in);	
	Random rng = new Random ();
	int Seed, die1, die2, result1 = 0 , result2 = 0; 
	int count = 0, score1 = 0, score2 = 0;
	
	System.out.print("Enter a seed value to start the game: ");
	Seed = keyboard.nextInt();
	keyboard.nextLine();
	rng.setSeed(Seed);
	
	do{ 
		die1 = 1 + rng.nextInt(6);
		die2 = 1 + rng.nextInt(6);
		System.out.printf("Turn rolls: Player 1: %d Player 2: %d\n", die1, die2);
		if (die1 > die2){
			
			result1 = die1 - die2;
			score1 += result1;
			
			System.out.printf("	Turn winner: Player 1 by %d pips\n" ,result1);
			System.out.printf("	New score:	Player 1 = %d	Player 2 = %d\n", score1, score2);
			count++;
		}
		if (die2 > die1){
			
			result2 = die2 - die1;
			score2 += result2;
	
			System.out.printf("	Turn winner: Player 2 by %d pips\n" ,result2);
			System.out.printf("	New score:	Player 1 = %d	Player 2 = %d\n", score1, score2);
			count++;
		}
		if (die1 == die2){
		
			System.out.print("	This turn was a tie. There is no change in score.\n");
		}
	
		} while (score1 < 10 && score2 < 10);
	
	System.out.println("---------");
	System.out.println("It took " +count+ " turns to play the game.\n");
	
	if (score1 >= 10)	
	System.out.printf("Player 1 won by a score of %d to %d\n", score1, score2);
	
	if (score2 >= 10)
	System.out.printf("Player 2 won by a score of %d to %d\n", score2, score1);	

		}
	}
