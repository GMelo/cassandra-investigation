package org.gmelo.intestigation.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by gmelo on 12/04/17.
 */
public class RandomUtils {

    private static final Random random = new Random();
    private static List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
    private static int alphabetBound = 25;

    public static String generateRandomString(String prefix, int size) {
        StringBuilder sb = new StringBuilder(prefix);
        IntStream.range(0, size)
                .forEach(r -> sb.append(alphabet.get(random.nextInt(alphabetBound))));

        return sb.toString();
    }

    public static boolean generateRandomBoolean() {
        return random.nextBoolean();
    }

    public static double generateDouble(int size){
       return random.nextInt(size) - random.nextDouble();
    }

}
