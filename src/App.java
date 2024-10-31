import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("____________________");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Choose your Drink:");
        System.out.println("Type Coffee or Mate or Wine or Soda or Anyother drink to look what you choose:");
        String bebida = scanner.nextLine();

        switch (bebida) {
            case "Coffee":
                System.out.println("Very Java Style don't you think!");
                break;
            case "Mate":
                System.out.println("Are you from Argentina?");
                break;
            case "Wine":
                System.out.println("Very sophisticated drink!");
                break;
            case "Soda":
                System.out.println("Be careful with your health, it has sugar!");
                break;
            default:
                System.out.println("Must be a different drink or it's water");
                break;
        }
        System.out.println("____________________");

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Last Name:");
        String lastname = scanner.nextLine();

        System.out.println("User: " + name + " " + lastname);

        System.out.println("____________________");
        System.out.println("Arrays:");
        System.out.println("Numbers:");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("");
        System.out.println("Drivers:");
        String[] drivers = { "Sergio", "Lewis", "Max", "Lando", "Charles" };
        for (int i = 0; i < drivers.length; i++) {
            System.out.print(drivers[i] + " ");
        }
        System.out.println("");
        System.out.println("____________________");
        System.out.println("Numbers:");
        // foreach
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println("");
        System.out.println("Drivers:");
        for (String namep : drivers) {
            System.out.print(namep + " ");
        }

        System.out.println("");
        System.out.println("____________________");
        System.out.println("Array of numbers:");
        int[] numberst = new int[5];
        for (int i = 0; i < numberst.length; i++) {
            System.out.println("Type a number");
            numberst[i] = scanner.nextInt();
        }

        System.out.println("List of Entered Numbers: ");
        for (int i = 0; i < numberst.length; i++) {
            System.out.print(numberst[i] + " ");
        }

        System.out.println("");
        System.out.println("____________________");
        System.out.println("Array of Drivers:");
        String[] driversf = new String[5];
        for (int i = 0; i < driversf.length; i++) {
            System.out.println("Type a Driver");
            driversf[i] = scanner.next();
        }

        System.out.println("Entered Drivers : ");
        for (int i = 0; i < driversf.length; i++) {
            System.out.print(driversf[i] + " ");
        }

        scanner.close();
    }
}
