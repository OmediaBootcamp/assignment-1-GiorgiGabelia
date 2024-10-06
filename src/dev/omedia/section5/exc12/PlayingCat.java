package dev.omedia.section5.exc12;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}
