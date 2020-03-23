package ua.lviv.iot.regex;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TextCheckerTest {

//    @Test
//       public void inputText() {
//        String stringInput = "something";
//        InputStream inputStreamForString = new ByteArrayInputStream(stringInput.getBytes());
//        Scanner scannerForString = new Scanner(inputStreamForString);
//        String string = scannerForString.nextLine();
//        String replaceText = string.replaceAll("[^A-Za-zА-Я\\s]", "");
//        TextChecker.checkPatterns(replaceText);
//    }


    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text please: ");
        String text = in.nextLine();
        in.close();
        String replaceText = text.replaceAll("[^A-Za-zА-Я\\s]", "");
        TextChecker.checkPatterns(replaceText);
    }
}
