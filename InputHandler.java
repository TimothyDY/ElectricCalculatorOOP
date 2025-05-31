import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static double inputDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Value must be greater than 0.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static double[] inputArrayResistor(int count) {
        double[] array = new double[count];
        for (int i = 0; i < count; i++) {
            array[i] = inputDouble("Resistor " + (i + 1) + " (Ohm): ");
        }
        return array;
    }

    public static int inputMenuChoice() {
        System.out.print("Your choice: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int inputResistorCount() {
        while (true) {
            System.out.print("Enter the number of resistors: ");
            try {
                int count = Integer.parseInt(scanner.nextLine());
                if (count <= 0) {
                    System.out.println("Count must be greater than 0.");
                } else {
                    return count;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }
}