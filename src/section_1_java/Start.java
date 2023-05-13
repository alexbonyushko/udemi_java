package section_1_java;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        /**
         * 7. Conditional
         */
        char ch, answer = 'B';
        System.out.println("What letters did I ask? ");
        System.out.print("Try to answer letter: ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println(" Congrat! ");
        } else if (ch > answer) {
            System.out.println(" A lot! ");
        } else {
            System.out.println(" A little !");
        }

    }
}
