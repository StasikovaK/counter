import java.util.Scanner;

public class Main {

Counter counter = new Counter();
Scanner scanner = new Scanner(System.in);
Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();

        main.showMenu();
    }

    void showMenu () {
        String userInput = "";

        do {
            System.out.println("\nCOUNTER PROGRAM. Please choose an action: ");
            System.out.println("\n1. Count Up");
            System.out.println("2. Count Down");
            System.out.println("\nType 'QUIT'to exit program");

            System.out.println("\nChoose A Number:");
            userInput = scanner.nextLine();

            switch(userInput) {
                case "quit", "Quit", "QUIT":
                    System.out.println("\nEXITING PROGRAM...");
                    break;
                case "1":
                    //count up
                    countUp();
                    break;
                case "2":
                    //count down
                    countDown();
                    break;
                default:
                    break;
            }
        } while (!userInput.equalsIgnoreCase("quit"));

        return;
    }

    void countUp() {

        System.out.println("\n");
        System.out.println("COUNT UP");

        System.out.println("\nEnter START number:");
        int start = intScanner.nextInt();

        System.out.println("Enter STOP number:");
        int stop = intScanner.nextInt();

        System.out.println("\n");

        counter.countTo(start,stop);
    }

    void countDown() {

        System.out.println("\n");
        System.out.println("COUNT DOWN");

        System.out.println("\nEnter START number");
        int start = intScanner.nextInt();

        System.out.println("Enter STOP number");
        int stop = intScanner.nextInt();

        System.out.println("\n");

        counter.countDown(start,stop);
    }
}





/*Create a menu that prints WELCOME MESSAGE like so:
        Counter Program. Please choose an action:
            1. Count Up
            2. Count Down
        User should be able to select either 1 or 2, and quit to exit program.
        Also user should be able to input the start and stop value to be counted.
        If either is selected call the corresponding method.

        create the method for counting down from a start number to a stop number
        in your counter class and call thet method if 2 is selected
     */
