/* ------------------------------------------ *
 * Command-line D&D                           *
 * Author: Ben Wilson                         *
 * Date Created: April 2014                   *
 * Date Modified:                             *
 * ------------------------------------------ *
 * This is intended to be a text-based        *
 * rogue-like. we'll see how well I can do it.*
 * ------------------------------------------ */
import java.util.Random;
 
public class Game {

	private static Random dicebag;
	
	static int roll20(String s) {
		return (dicebag.nextInt(19) +1);
	}
	
	static void init() {
		dicebag = new Random();
	}
	
	public static void main (String[] args) {
		System.out.println("You stand in a 10' x 10' room. In the centre is a pedestal upon which sits a pie. between you and the pedestal, there stands an orc!");
		System.out.println("What do you do?");
		System.out.println("1. Attack the orc!");
		System.out.println("2. Run away!");
		System.out.println("3. Ask politely.");
		
		
		init();
		
		System.out.println( "You rolled a " + roll20("") + "!" );
		
	}
	
}
