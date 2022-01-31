package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Objects;

public class CharacterHash {
    public static HashMap<Character,Integer> charHashOutput(char[] input){
        HashMap<Character, Integer> outputHash = new HashMap<>();
        char[] testArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c: input){
            if(!alphabet.contains(Character.toString(c))){

            }else if(outputHash.size()==0){
                outputHash.put(c,1);
            }else if(outputHash.containsKey(c) && Objects.equals(outputHash.get(c),outputHash.get(c))){
                outputHash.put(c, outputHash.get(c)+1);
            }else{
                outputHash.put(c,1);
            }
        }
        return outputHash;
    }
}
