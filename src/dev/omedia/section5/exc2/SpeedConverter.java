package dev.omedia.section5.exc2;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour == -1 ? "Invalid Value"
                : String.format("%s km/h = %s mi/h", kilometersPerHour, milesPerHour));
    }
}
