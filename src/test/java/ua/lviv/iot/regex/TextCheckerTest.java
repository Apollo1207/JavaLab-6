package ua.lviv.iot.regex;

import java.util.Scanner;

public class TextCheckerTest {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text please: ");
        String text = in.nextLine();
        in.close();
        String replaceText = text.replaceAll("[^A-Za-zА-Я\\s]", "");
        TextChecker.checkPatterns(replaceText);
    }

}
