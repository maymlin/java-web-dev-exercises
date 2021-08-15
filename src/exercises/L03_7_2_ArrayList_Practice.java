package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L03_7_2_ArrayList_Practice {
    public static void main(String[] args) {

        System.out.println("*** Sum of Even Numbers ***");
        printEven();

        System.out.println();

        System.out.println("*** 5-Letter Words ***");
        print5LetterWords();

        System.out.println();

        System.out.println("*** Prompt for Word-Length ***");

    }

//        #1 Write a static method to find the sum of all the even numbers in
//        an ArrayList. Within main, create a list with at least 10 integers
//        and call your method on the list.

    public static void printEven() {
        ArrayList<Integer> intArrList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
        );

        Integer sumOfEvenNumber = 0;

        for (Integer num : intArrList) {
            if (num % 2 == 0) {
                sumOfEvenNumber += num;
            }
        }

        System.out.println("sum = " + sumOfEvenNumber);
    }

//        #2 Write a static method to print out each word in a list that has
//        exactly 5 letters.

    public static void print5LetterWords() {
        ArrayList<String> strArrList = new ArrayList<>(
                List.of("Sir", "Walter", "Scott", "was", "a", "Scottish",
                        "historical", "novelist")
        );

        for (String word : strArrList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    public static void printWords() {

    }
}
