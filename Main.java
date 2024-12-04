import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static boolean mainActive = true;
	static boolean active = true;
	static boolean active_2 = true;
	static int input_menu = 0;
	
	static String task = "";
	static String item_one = "";
	static String item_two = "";
	static String item_three = "";
	static String item_four = "";
	static String item_five = "";
	static String item_six = "";

	public static void main(String[] args) {
		menu();
		
			while(mainActive) {
				if (input_menu == 1) {
					menu_1();
				} else if (input_menu == 2) {
					menu_2();
				} else if(input_menu == 3) {
					active = false;
					menu_3();
				} else if(input_menu == 4) {
					mainActive = false;
					menu_4();
				}
			}
			
		scanner.close();

	}
	
	public static void menu() {
		while(active) {
			System.out.println("     To-Do List🙂");
			System.out.println("1. Display To-Do list");
			System.out.println("2. Add to To-Do list");
			System.out.println("3. Delete from To-Do list");
			System.out.println("4. Exit");
			System.out.println("Select an option (1-4):");
			
			try {
				input_menu = scanner.nextInt();
				
				if (input_menu == 1 ||input_menu == 2 || input_menu == 3 || input_menu == 4) {
					active = false;
				} else {
					System.out.println("Input error. Enter a number between 1-4. Try again.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Invald input. Please enter a numerical value.");
				scanner.nextLine();
			}
		}
	}
	
	public static void menu_1() {
		active_2 = true;
		while(active_2) {
			System.out.println("     To-Do List🙂");
			System.out.println("1. " + item_one);
			System.out.println("2. " + item_two);
			System.out.println("3. " + item_three);
			System.out.println("4. " + item_four);
			System.out.println("5. " + item_five);
			System.out.println("6. " + item_six);
			
			System.out.println();
			System.out.println("Select an option (1 or 2):");
			System.out.println("1. Back to menu");
			System.out.println("2. Exit");
			
			try {
				input_menu = scanner.nextInt();
				
				if(input_menu == 1) {
					active_2 = false;
					active = true;
					menu();
				} else if(input_menu == 2) {
					active_2 = false;
					mainActive = false;
					menu_4();
				} else {
					System.out.println("Input error. Enter 1 or 2. Try again.");
				}
				}
			catch(InputMismatchException e) {
				System.out.println("Invald input. Please enter a numerical value.");
				scanner.nextLine();
			}
		}
	}
	
	public static void menu_2() {
		System.out.println("Type and enter your task that you want to add:");
		scanner.nextLine();
		task = scanner.nextLine();
		
	    if (item_one.isEmpty()) {
	        item_one = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else if (item_two.isEmpty()) {
	        item_two = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else if (item_three.isEmpty()) {
	        item_three = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else if (item_four.isEmpty()) {
	        item_four = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else if (item_five.isEmpty()) {
	        item_five = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else if (item_six.isEmpty()) {
	        item_six = task;
	        System.out.println("Task successfully added. Returning to main menu.");
	    } else {
	        System.out.println("Your To-Do list is too full. Finish and delete tasks to add more.");
		    active = true;
		    menu();
	        return;
	    }

	    active = true;
	    menu();
	}
	
	public static void menu_3() {
	    active_2 = true;
	    while (active_2) {
	        System.out.println("     To-Do List🙂");
	        System.out.println("1. " + item_one);
	        System.out.println("2. " + item_two);
	        System.out.println("3. " + item_three);
	        System.out.println("4. " + item_four);
	        System.out.println("5. " + item_five);
	        System.out.println("6. " + item_six);
	        System.out.println();
	        System.out.println("Enter the number of the task you would like to delete (1-6):");
	        System.out.println("Or enter 0 to go back to the main menu.");

	        try {
	            int deleteChoice = scanner.nextInt();

	            if (deleteChoice == 0) {
	                active_2 = false;
	                active = true;
	                menu();
	            } else if (deleteChoice >= 1 && deleteChoice <= 6) {
	                deleteTask(deleteChoice);
	                System.out.println("Task successfully deleted. Returning to main menu.");
	                active_2 = false;
	                active = true;
	                menu();
	            } else {
	                System.out.println("Invalid input. Enter a number between 1-6 or 0 to go back.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a numerical value.");
	            scanner.nextLine();
	        }
	    }
	}
	
	private static void deleteTask(int taskNumber) {
	    switch (taskNumber) {
	        case 1 -> item_one = "";
	        case 2 -> item_two = "";
	        case 3 -> item_three = "";
	        case 4 -> item_four = "";
	        case 5 -> item_five = "";
	        case 6 -> item_six = "";
	        default -> System.out.println("Error: Task number out of range.");
	    }
	}
	public static void menu_4() {
		System.out.println("Goodbye! Have a nice day! 🙂");
	}
}
