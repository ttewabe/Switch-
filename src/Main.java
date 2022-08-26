import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to our Diner! Please select an entree:\n"
                + "1) steak\n"
                + "2) wings\n"
                + "3) salad\n"
                + "and any other number for nothing!");

        int number = scanner.nextInt();

        switch(number) {
            case 1: System.out.println("Here is your steak!");
                break;
            case 2: System.out.println("Here is your wings!");
                break;
            case 3: System.out.println("Here is your salad!");
                break;
            default: System.out.println("You want nothing?!");
                break;
        }
        System.out.println("\nPlease select a drink:\n"
                + "1) iced tea\n"
                + "2) soda\n"
                + "3) lemonade\n"
                + "and any other number for nothing!");

        int select = scanner.nextInt();

        switch(select){
            case 1: System.out.println("Here is your iced tea!");
                break;
            case 2: System.out.println("Here is your soda!");
                break;
            case 3: System.out.println("Here is your lemonade!");
                break;
            default: System.out.println("You want nothing?!");
                break;
        }
        scanner.close();
    }
}