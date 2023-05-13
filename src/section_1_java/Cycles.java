package section_1_java;

import java.io.IOException;

/**
 * 8.Cycles
 */
public class Cycles {

    public static void howWorkFor(int i) throws IOException {
        for (i = 0; (char) System.in.read() != 's'; i++) {
            System.out.println("Iteration " + i);
        }
    }

    public static void howWorkWhile(int count) {
        count = 0;
        while (count < 10) {
            System.out.println("Count = " + count);
            count++;
        }
    }

    public static void howWorkDoWhile(int count) {
        do {
            System.out.println(count);
        } while (count < 10);
    }

    public static void ciclePlusIf(int count) {
        while (count < 10) {
            count++;
            if (count % 2 != 0) continue;
            System.out.println(count);
        }
    }

    public static void main(String[] args) throws IOException {
        howWorkFor(0);
        howWorkWhile(0);
        howWorkDoWhile(10);
        ciclePlusIf(0);
    }
}
