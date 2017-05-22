import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.next();
		checkForQuit(firstName);

		System.out.println("What is your last name?");
		String lastName = input.next();
		checkForQuit(lastName);

		System.out.println("What is your age?");
		String a = input.next();
		checkForQuit(a);
		int age = Integer.parseInt(a);

		System.out.println("What is the number of your birth month?");
		String b = input.next();
		checkForQuit(b);
		int birthMonth = Integer.parseInt(b);

		System.out.println("What is your favorite ROYGBIV color? If you don't know what this means type \"Help\".");
		String color = input.next();
		checkForQuit(color);

		if (color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Orange") || color.equalsIgnoreCase("Yellow")
				|| color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Indigo")
				|| color.equalsIgnoreCase("Violet")) {

		} else if (color.equalsIgnoreCase("help")) {
			System.out.println(
					"List of colors: \nRed \nOrange \nYellow \nGreen \nBlue \nIndigo \nViolet \nChoose one please.");
			color = input.next();
			checkForQuit(color);
		}

		System.out.println("What is the number of siblings you have?");
		String c = input.next();
		checkForQuit(c);
		int sibs = Integer.parseInt(c);

		int numberOfYears = 0;
		if (age % 2 == 0) {
			numberOfYears = 5;
		} else if (age % 2 != 0) {
			numberOfYears = 35;
		}
		String vaycay = "none";
		if (sibs == 0) {
			vaycay = ("Florida");
		} else if (sibs == 1) {
			vaycay = ("San Franciso");
		} else if (sibs == 2) {
			vaycay = ("New Zealand");
		} else if (sibs == 3) {
			vaycay = ("Bali");
		} else if (sibs > 3) {
			vaycay = ("Atlantis");
		} else {
			vaycay = ("Haiti");
		}
		String transport = "none";
		transport = (color);
		switch (color) {

		case "Red":
		case "red":
		case "RED":
			transport = ("plane");
			break;
		case "Orange":
		case "orange":
		case "ORANGE":
			transport = ("car");
			break;
		case "Yellow":
		case "yellow":
		case "YELLOW":
			transport = ("flaming chariot");
			break;
		case "Green":
		case "green":
		case "GREEN":
			transport = ("train");
			break;
		case "BLUE":
		case "blue":
		case "Blue":
			transport = ("unicorn");
			break;
		case "INDIGO":
		case "Indigo":
		case "indigo":
			transport = ("roller skates");
			break;
		case "Violet":
		case "violet":
		case "VIOLET":
			transport = ("mule");
			break;

		}

		String salary = "none";
		if (birthMonth == 1 || birthMonth == 2 || birthMonth == 3 || birthMonth == 4) {
			salary = ("$25,000");
		} else if (birthMonth == 5 || birthMonth == 6 || birthMonth == 7 || birthMonth == 8) {
			salary = ("$50,000");
		} else if (birthMonth == 9 || birthMonth == 10 || birthMonth == 11 || birthMonth == 12) {
			salary = ("$75,000");
		} else {
			salary = ("$0.00");

		}
		System.out.println(firstName + " " + lastName + " will retire in " + numberOfYears + " years with " + salary
				+ " in the bank, a vacation home in " + vaycay + " and a " + transport + ".");
		input.close();
	}

	public static void checkForQuit(String input) {
		if (input.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);

		}
	}
}