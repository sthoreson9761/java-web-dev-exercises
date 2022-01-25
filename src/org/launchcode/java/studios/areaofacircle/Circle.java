package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius){
        return 3.14 * radius * radius;
    }
    public static boolean inputValidation(String str){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        if(str.isEmpty()){
            return false;
        }
        for(int i = 0; i<str.length();i++){
            char test = str.toLowerCase().charAt(i);
            if(alphabet.contains(""+test)){
                return false;
            }
            if(test == '.'){
                count++;
            }
        }
        if(count > 1 || Double.parseDouble(str) < 0){
            return false;
        }else{
            return true;
        }

    }
}
