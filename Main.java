public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SIMPLE ELECTRIC CALCULATOR ===");
            System.out.println("1. Calculate Voltage (V)");
            System.out.println("2. Calculate Current (I)");
            System.out.println("3. Calculate Resistance (R)");
            System.out.println("4. Calculate Total Series Resistance");
            System.out.println("5. Calculate Total Parallel Resistance");
            System.out.println("6. Exit");

            int choice = InputHandler.inputMenuChoice();

            switch (choice) {
                case 1:
                    double i1 = InputHandler.inputDouble("Enter current (Ampere): ");
                    double r1 = InputHandler.inputDouble("Enter resistance (Ohm): ");
                    System.out.println("Voltage = " + ElectricCalculator.calculateVoltage(i1, r1) + " Volt");
                    break;

                case 2:
                    double v2 = InputHandler.inputDouble("Enter voltage (Volt): ");
                    double r2 = InputHandler.inputDouble("Enter resistance (Ohm): ");
                    System.out.println("Current = " + ElectricCalculator.calculateCurrent(v2, r2) + " Ampere");
                    break;

                case 3:
                    double v3 = InputHandler.inputDouble("Enter voltage (Volt): ");
                    double i3 = InputHandler.inputDouble("Enter current (Ampere): ");
                    System.out.println("Resistance = " + ElectricCalculator.calculateResistance(v3, i3) + " Ohm");
                    break;

                case 4:
                    int seriesCount = InputHandler.inputResistorCount();
                    double[] rSeries = InputHandler.inputArrayResistor(seriesCount);
                    System.out.println("Total series resistance = " + ElectricCalculator.calculateSeriesResistance(rSeries) + " Ohm");
                    break;

                case 5:
                    int parallelCount = InputHandler.inputResistorCount();
                    double[] rParallel = InputHandler.inputArrayResistor(parallelCount);
                    System.out.println("Total parallel resistance = " + ElectricCalculator.calculateParallelResistance(rParallel) + " Ohm");
                    break;

                case 6:
                    System.out.println("Thank you for using the calculator.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}