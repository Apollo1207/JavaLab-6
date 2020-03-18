package ua.lviv.iot.regex;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.regex.TextChecker;

import java.util.Scanner;

public class TextCheckerTest {
    @Test
    public void inputText() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("sada");
//        System.out.print("Input a text: ");
//        String text = in.nextLine();
        String text = "aaaaedd dbklaeoctr";
        TextChecker.checkPatterns(text);
    }
}
