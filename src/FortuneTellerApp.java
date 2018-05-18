import java.util.Scanner;

public class FortuneTellerApp {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		System.out.println("If your name is Donny, you are cool af. If not, you would be a hell of a lot cooler if it was.");
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		
		int x;
		System.out.println("What is your age?"); 
		x = input.nextInt();
		String age = input.nextLine();
		if ( x % 2 == 0 )
		System.out.println("You will retire in 20 years. That sucks lulz");
		else
		System.out.println("You will die before you retire. lolololol pwned!!1!111!1!!!");
		
		

        System.out.println("In what month were you born?"); 

        String birthMonth;

        birthMonth = input.nextLine();

        if (birthMonth.equalsIgnoreCase("January")) {

        } else if (birthMonth.equalsIgnoreCase("February")) {

        } else if (birthMonth.equalsIgnoreCase("March")) {

        } else if (birthMonth.equalsIgnoreCase("April")) {
        
        } else if (birthMonth.equalsIgnoreCase("May")) {
        
        } else if (birthMonth.equalsIgnoreCase("June")) {
        
        } else if (birthMonth.equalsIgnoreCase("July")) {
        
        } else if (birthMonth.equalsIgnoreCase("August")) {
        
        } else if (birthMonth.equalsIgnoreCase("September")) {
        
        } else if (birthMonth.equalsIgnoreCase("October")) {
        
        } else if (birthMonth.equalsIgnoreCase("November")) {
        
        } else if (birthMonth.equalsIgnoreCase("December")) {
        
        	}
        
        

        
       Scanner colors = new Scanner(System.in);

        System.out.println("What is your favorite ROYGBIV color? Enter \"Help\" If you are unsure of the ROYGBIV colors."); 

     
        String favoriteColor = null;
        
        favoriteColor = input.nextLine();
        switch (String.valueOf(favoriteColor)) {
        
        
        case ("Red"):
        	System.out.println("Red");
        	break;
        case "Orange":
        	System.out.println("Orange");
        	break;
        case "Yellow":
        	System.out.println("Yellow");
        	break;
        case "Green":
        	System.out.println("Green");
        	break;
        case "Blue":
        	System.out.println("Blue");
        	break;
        case "Indigo":
        	System.out.println("Indigo");
        	break;
        case "Violet":
        	System.out.println("Violet");
        	break;
        case "Help":
        	System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
        	break;
        default:
            System.out.println("Invalid color.");
            break;
        	}
       
        System.out.println("How many siblings do you have?");
		String numberOfSiblings = input.nextLine();
		int s;
		s = input.nextInt();
		if ( s < 0 )
		System.out.println("You should live 6ft. in the ground. You're not funny.");
		else
		System.out.println("You will die before you retire. lolololol pwned!!1!111!1!!!");

        }
}


        
        
        	
        	
        	
        	
        	

