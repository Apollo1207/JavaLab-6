package ua.lviv.iot.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextChecker {

    public static void checkPatterns(final String textToCheck) {
        String textToChecks = textToCheck.trim().replaceAll("\\s{2,}", " ");

        LinkedList<String> words = new LinkedList<>();
        Pattern pattern = Pattern.compile("\\s");
        String[] formatTextToCheck = pattern.split(textToChecks);

        for (String s : formatTextToCheck) {
            words.add(s);
        }


        Iterator<String> wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            String word = wordsIterator.next();

            int countVowels = 0;
            Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
            Matcher vowelMatcher = vowelPattern.matcher(word);
            while (vowelMatcher.find()) {
                countVowels++;
            }


            int countConsonant = 0;
            Pattern consonantPatterns = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
            Matcher consonantMatchers = consonantPatterns.matcher(word);
            while (consonantMatchers.find()) {
                countConsonant++;
            }


            if (countVowels > countConsonant) {
                wordsIterator.remove();
            }

        }
        System.out.println(words);

    }
}