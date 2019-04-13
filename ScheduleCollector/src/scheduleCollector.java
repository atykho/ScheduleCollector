import java.util.Scanner;

public class ScheduleCollector {
	
	
	//obtains the user input and begins the program
	public static void main(String args[]) {
		
		// Access the input from the scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts and saves user times for Monday
		System.out.println("Enter your friend's free time for Monday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String monday[] = new String[24];
		String mondayInput = input.nextLine();
		monday = mondayInput.split("\\s+");
		
		// Prompts and saves user times for Tuesday
		System.out.println("Enter your friend's free time for Tuesday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String tuesday[] = new String[24];
		String tuesdayInput = input.nextLine();
		tuesday = tuesdayInput.split("\\s+");
		
		// Prompts and saves user times for Wednesday
		System.out.println("Enter your friend's free time for Wednesday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String wednesday[] = new String[24];
		String wednesdayInput = input.nextLine();
		wednesday = wednesdayInput.split("\\s+");

		// Prompts and saves user times for Thursday
		System.out.println("Enter your friend's free time for Thursday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String thursday[] = new String[24];
		String thursdayInput = input.nextLine();
		thursday = thursdayInput.split("\\s+");

		// Prompts and saves user times for Friday
		System.out.println("Enter your friend's free time for Friday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String friday[] = new String[24];
		String fridayInput = input.nextLine();
		friday = fridayInput.split("\\s+");

		// Prompts and saves user times for Saturday
		System.out.println("Enter your friend's free time for Saturday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String saturday[] = new String[24];
		String saturdayInput = input.nextLine();
		saturday = saturdayInput.split("\\s+");

		// Prompts and saves user times for Sunday
		System.out.println("Enter your friend's free time for Sunday in military time starting with 0:00: (i.e. 0:00-3:00 5:30-7:15). ");
		String sunday[] = new String[24];
		String sundayInput = input.nextLine();
		sunday = sundayInput.split("\\s+");
			
		input.close();
			
	}
		
			
	
	//gets the day of the week
	public static String getDay(int index) {
		//array of the days of the week
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		//return the day needed
		return weekDays[index];
	}

	//creates the friend's array
	public static String getFriends() {
		//array of the days of the week
		String[] friends = {"Alex", "Katie", "Zoe"};
		
		//return the day needed
		return friends;
	}

	
	public static void newInfo() {
		//creates new array
		String[][] times = new String[24][7];
	
		//fill the array
		for (int x=0; x<=4; x++) {
			for (int i=0; i<=24; i++) {
				times[i][x] = "lol";
				
			}
		}
	}
	
