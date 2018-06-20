import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("If your name is Donny, you are cool af. If not, you would be a hell of a lot cooler if it was.");
		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		int a;
		System.out.println(firstName + " " + lastName + ", I knew that. I'm a forune teller and all. What is your age?");
		a = input.nextInt();
		if (a >= 25) {
			System.out.println("You will retire within 40 years");
		} else if (a < 25 && a > 0) {
			System.out.println("You will die before you retire.");
		} else {
			System.out.println("You're not funny");
		}

		System.out.println("In what month were you born?");
		String birthMonth;
		birthMonth = input.nextLine();
		if (birthMonth.equalsIgnoreCase("January")) {
			System.out.println("You will be a billionaire");

		} else if (birthMonth.equalsIgnoreCase("February")) {
			System.out.println("You will be a billionaire");

		} else if (birthMonth.equalsIgnoreCase("March")) {
			System.out.println("You will never have more than $50,000");

		} else if (birthMonth.equalsIgnoreCase("April")) {
			System.out.println("You will be a millionaire");

		} else if (birthMonth.equalsIgnoreCase("May")) {
			System.out.println("You will never have more than $15,000");

		} else if (birthMonth.equalsIgnoreCase("June")) {
			System.out.println("You will never have more than $100,000");

		} else if (birthMonth.equalsIgnoreCase("July")) {
			System.out.println("You will never have more than $250,000");

		} else if (birthMonth.equalsIgnoreCase("August")) {
			System.out.println("You will be a millionaire");

		} else if (birthMonth.equalsIgnoreCase("September")) {
			System.out.println("You will be a billionaire");

		} else if (birthMonth.equalsIgnoreCase("October")) {
			System.out.println("You will be a millionaire");

		} else if (birthMonth.equalsIgnoreCase("November")) {
			System.out.println("You will be a billionaire");

		} else if (birthMonth.equalsIgnoreCase("December")) {
			System.out.println("You will never have more than $100,000");

		}

		System.out.println(
				"What is your favorite ROYGBIV color? Enter \"Help\" If you are unsure of the ROYGBIV colors.");
		String favoriteColor = null;
		favoriteColor = input.nextLine();
		switch (String.valueOf(favoriteColor)) {
			case ("Red"):
			case ("red"):
				System.out.println("The next vehicle you purchase will be an exotic sports car.");
				break;
			case "Orange":
			case "orange":
				System.out.println("The next vehicle you purchase will be a sedan.");
				break;
			case "Yellow":
			case "yellow":
				System.out.println("The next vehicle you purchase will be a convertible.");
				break;
			case "Green":
			case "green":
				System.out.println("The next vehicle you purchase will be a coupe.");
				break;
			case "Blue":
			case "blue":
				System.out.println("The next vehicle you purchase will be a pickup truck.");
				break;
			case "Indigo":
			case "indigo":
				System.out.println("The next vehicle you purchase will be an SUV.");
				break;
			case "Violet":
			case "violet":
				System.out.println("The next vehicle you purchase will be a minivan.");
				break;
			case "Help":
			case "help":
			System.out.println("If you don't know the ROYGBIV colors, you will total your current vehicle and be doomed to ride the COTA.");
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
				break;
			default:
				System.out.println("Invalid color. You will lose your legs and lose races to Lt. Dan every day for the rest of your life.");
				break;
		}
		
		System.out.println("How many siblings do you have?");
		int s;
		s = input.nextInt();
		if (s == 0) {
			System.out.println("The next place you live will be a single family home.");
		} else if (s == 1) {
			System.out.println("The next place you live will be a condo.");
		} else if (s == 2) {
			System.out.println("The next place you live will be a downtown Columbus, Ohio condo where you can watch the fireworks from your balcony during Red White and Boom.");
		} else if (s == 3) {
			System.out.println("The next place you live will be an apartment.");
		} else if (s >= 4) {
			System.out.println("The next place you live  will be a trailer in a mobile home park.");
		} else {
			System.out.println("You will be homeless and live under the E. Broad St. bridge on Interstate 71.");
		}

		System.out.println("I think that outghta give us enough insight into your future. Let's sum up your results:");
		System.out.println();

	}

}
