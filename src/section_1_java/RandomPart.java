package section_1_java;

import java.util.Random;

/**
 * 10.Random
 */
public class RandomPart {

    public static int randomMath() {
        int num = (int) (Math.random() * 100);
        return num;
    }

    public static void randomRandom(int limit) {
        Random random = new Random();
        int num = random.nextInt(limit);
        System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println(randomMath());
        randomRandom(10);
    }
}
