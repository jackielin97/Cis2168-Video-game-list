package assign2_template;

import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ManageVideoGames {

	public static void main(String[] args) {

		// 2.2.2 Application Class - ManageVideoGames

		// create an empty list of VideoGames
		LinkedList<VideoGame> videogamecollection = new LinkedList<VideoGame>();
		while (true) {
			// 1. display menu
			displayMenu();
			System.out.println("Pick your choice");
			// 2. get user choice
			int returnus = getUserChoice();
			System.out.print(returnus);
			// 3. take action based on user choice
			if (returnus == 1) {
				// getNewGame();

				addGame(videogamecollection, getNewGame());

			} else if (returnus == 2) {
				videogamecollection.remove(videogamecollection.size() - 1);

			} else if (returnus == 3) {

				for (VideoGame v : videogamecollection) {
					System.out.println(v.toString());
				}
			} else if (returnus == 6) {
				break;
			}
		}

		// 4. loop through steps 1, 2, 3 above until user quits

	}

	// define other methods for modularization, samples are listed below.

	// method to display menu
	public static void displayMenu() {
		// add your code
		// display the menu like in Page 5 in Assign2-F21.pdf
		System.out.println("Please Pick one o these Opintions");
		System.out.println("1. Add a new game  ");
		System.out.println("2. Remove an existing game   ");
		System.out.println("3. Display the games in the order they were inserted  ");
		System.out.println("4. Find games with latest release   ");
		System.out.println("5. Add a new game in the alphabetical order of game titles ");
		System.out.println("6. Exit  ");
	}

	// method to get user choice

	public static int getUserChoice() {
		// add your code
		Scanner scanner = new Scanner(System.in);
		String input;
		boolean p = true;
		do {
			input = scanner.nextLine();
			switch (input) {
			case "1":
				p = false;
				break;
			case "2":
				p = false;
				break;
			case "3":
				p = false;
				break;
			case "4":
				p = false;
				break;
			case "5":
				p = false;
				break;
			case "6":
				p = false;
				break;

			default:
				System.out.println("Try agian");
				break;
			// keep reading user input until user enters correct input
			}
		} while (p);
		int i = Integer.parseInt(input);

		return i;
	}

	// method to get user input, create and return a video game
	public static VideoGame getNewGame() {
		/*
		 * get new game based on user input: keyboard input
		 * 
		 * game title: use nextLine() to avoid problems caused by newline character
		 * 
		 * 
		 * platforms: get how-many: int use loop to get each platform.
		 * 
		 * date value: get 3 integers: month, day, year use LocaleDate.of(year, month,
		 * day) to create a date TestDate.java
		 */
		// game title
		Scanner game = new Scanner(System.in);
		String gametitle;
		System.out.println("Enter your game tile");
		gametitle = game.nextLine();

		System.out.println("PLease enter da developer");
		String developer = game.nextLine();

		// platforms

		String platform_title;
		int platform_limit;
		System.out.println("Enter how many platofrms you want");
		platform_limit = Integer.parseInt(game.nextLine());
		String Platforms[] = new String[platform_limit];

		for (int i = 0; i < platform_limit; i++) {
			System.out.print("Print you platform");
			platform_title = game.nextLine();
			Platforms[i] = platform_title;

		}
		// Date valu
		System.out.println("please enter month ");
		int month = Integer.parseInt(game.nextLine());
		System.out.println("please enter year ");
		int year = Integer.parseInt(game.nextLine());
		System.out.println("please enter day ");
		int day = Integer.parseInt(game.nextLine());

		LocalDate localDate = LocalDate.of(year, month, day);

		VideoGame hi = new VideoGame(gametitle, developer, Platforms, localDate);
		return hi;
	}

	private static void addGame(List videogamecollection, VideoGame otherGame) {
		videogamecollection.add(otherGame);
	}

	// method to add a video game without maintaining sorted order
	// add your own code

	// method to remove a game based on user input
	// add your own code

	// method to find the game with latest release date
	// add your own code
	/*
	 * find game with latest release date simple assumption: only one game has the
	 * latest release date. need to loop through the collection and find the latest
	 * release date (largest) while looping, record and update the current latest
	 * release date value and the corresponding VideoGame object.
	 * 
	 * compare dates: isBefore, isAfter, or compareTo TestDate.java
	 */

	// OPTIONAL BONUS:
	// method to add a video game in alphabetical order of game titles
	// add your own code
	/*
	 * add new game in alphabetical order of game titles Do not append the new game
	 * to the current collection and then sort the entire collection. Instead, start
	 * with the first game, loop through the collection and find the first game
	 * whose title is alphabetically larger than the new game. Then insert the new
	 * game at the location of this target. If no existing game title is larger than
	 * the new game, append the new game to the end of game collection list.
	 * 
	 */
}
