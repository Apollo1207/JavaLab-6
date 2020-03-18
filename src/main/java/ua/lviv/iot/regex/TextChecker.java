package ua.lviv.iot.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextChecker {

    public static void checkPatterns(final String str) {
        ArrayList<String> foundStrings = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\s[^!.?]");
        String[] strings = pattern.split(str);
        System.out.println(str);
        for (String s : strings) {
            foundStrings.add(s);

        }
        System.out.println(foundStrings);

        for (String string : foundStrings) {
            int count = 0;
            Pattern vowelPattern = Pattern.compile("[aeiou]");
            Matcher vowelMatcher = vowelPattern.matcher(string);

            while (vowelMatcher.find()) {
                count++;
            }
            System.out.println(count);
            int counts = 0;
            Pattern vowelPatterns = Pattern.compile("[dbklctr]");
            Matcher vowelMatchers = vowelPatterns.matcher(string);
            while (vowelMatchers.find()) {
                counts++;
            }
            System.out.println(counts);

            if (count > counts) {
                foundStrings.remove(string);

            }
            System.out.println(foundStrings);
        }


//        while (m.find()) {
//                     foundStrings.add(m.group());
//        }


//        String[] words = pattern.split(str);


//                    Matcher matcher = pattern.matcher(word);
//                    while (matcher.find()) {
//                        foundStrings.add(matcher.group());


//        String[] words = pattern.split(str);
//        System.out.println(words);
//        List<String> lists = new ArrayList<String>(Arrays.asList(words));
//        System.out.println(lists);
//        System.out.println(lists);
//                Pattern pattern = Pattern.compile("[ ,.!?]");
//               String[] words = pattern.split(str);
//        System.out.println(words);

//        List<String> lists = new ArrayList<String>(Arrays.asList(words));
//
//
//


//
//        System.out.println(count);


//        String pattern = "(?i)[aeiou]";
//        System.out.println(textToCheck);
//        System.out.println(textToCheck.replaceAll(pattern, "a").length());

//        String line = "aa";
//        String pattern = "[aeiou]";
//        System.out.println(line.replaceAll(pattern, "").length());
//    }
//}
//        String pattern = "(?i)[aeiou]";
//
//        Pattern r = Pattern.compile(pattern);
//
//        Matcher m = r.matcher(textToCheck);
//
//        while (m.find()) {
//            System.out.println(m.group(0));
//        }
//
//    }

//    public static void check(List<String> lists) {
//        for (String list : lists) {
//            Pattern patterns = Pattern.compile("[aeoui]");
//            Matcher matchers = patterns.matcher(list);
//            List<String> is = new ArrayList<>();
//            while (matchers.find()) {
//                is.add(matchers.group());
//            }
//            System.out.println(is);
//        }
//
//    }
//
//
//    public static void abc(List<String> lists) {
//        for (String lasts : lists) {
//            Pattern patterns = Pattern.compile("[bd]");
//            Matcher matchers = patterns.matcher(lasts);
//            List<String> iss = new ArrayList<>();
//            while (matchers.find()) {
//                iss.add(matchers.group());
//            }
//            System.out.println(iss);
//        }

    }
}