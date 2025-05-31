public class ElectricCalculator {

    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    public static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    public static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }

    public static double calculateSeriesResistance(double[] resistors) {
        double total = 0;
        for (double r : resistors) total += r;
        return total;
    }

    public static double calculateParallelResistance(double[] resistors) {
        double total = 0;
        for (double r : resistors) total += 1.0 / r;
        return 1.0 / total;
    }
} 