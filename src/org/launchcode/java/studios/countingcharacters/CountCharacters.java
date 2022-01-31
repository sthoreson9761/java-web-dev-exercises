package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;


public class CountCharacters {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        String sample = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.print("Enter a String to count its characters: ");
        String userIn = input.nextLine();
        char[] charactersInString = userIn.toLowerCase().toCharArray();

            HashMap<Character, Integer> outputHash = CharacterHash.charHashOutput(charactersInString);

            for(char h: outputHash.keySet()){
                System.out.println(h + ": " + outputHash.get(h));
            }




        input.close();
    }
//    public static char[] nonAlpha(String input){
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        String strOut="";
////        char[] inputArry = input.toCharArray();
//        for(int i = 0;i< input.length();i++){
//            if(!alphabet.contains(Character.toString(input.charAt(i)))){
//                strOut = input.substring(0,i)+input.substring(i+1);
//            }
//        }
//        return strOut.toCharArray();
//    }
}
