package dev.omedia.section5.exc3;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes < 0 ? "Invalid Value" :  String.format("%s KB = %s MB and %s KB", kiloBytes, kiloBytes / 1024 , kiloBytes % 1024));
    }
}
