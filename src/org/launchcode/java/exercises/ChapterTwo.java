package org.launchcode.java.exercises;
import java.util.Scanner;
public class ChapterTwo {
    public static void main(String[] arg){
        Scanner input =new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ".\n");

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int rectWidth = input2.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int rectLength = input2.nextInt();
        System.out.println("The area of the rectangle is " + (rectLength*rectWidth) + ".\n");

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.print("Enter a word to search for: ");
        String searchTerm = input.nextLine();
        int termLength = searchTerm.length();
        int index = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
        System.out.println("index: " + index + ", length: " + termLength);
        String test = sentence.toLowerCase().substring(0, index) + sentence.toLowerCase().substring(index + termLength);
        while (test.toLowerCase().contains(searchTerm.toLowerCase())) {
            index = test.indexOf(searchTerm.toLowerCase());
            System.out.println("index: " + index + ", length: " + termLength);
            test = test.substring(0, index) + test.substring(index + termLength);
        }
        System.out.println(test);
    }
}
