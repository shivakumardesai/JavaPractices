package com.shiva.programs;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * "It was decided to encode any string in the following manner - 'aaaabbcdefff'
 * will be encoded to 'a4b2c1d1e1f3'.
 *
 * Write a function that takes input as encoded string and an index and returns the character at the 'index'
 * position in the decoded string. For example in the above example where encoded string is a4b2c2d2e2f3,
 * for index 5 your function should return ""b"".
 * If index is out of range, then you should return an asterik ""*"""
 */


class CharacterSequence {
    public static void main(String[] args) {
        String decodedString = "aaaabbcdefff";
        int stringIndex=13;
        char[] characters = decodedString.toCharArray();
        System.out.println("Encoded String is "+encodeString(characters));
        decodedString=decodeString(encodeString(characters));
        System.out.println("Decoded String is "+decodedString);
        try {
            char[] a = decodedString.toCharArray();
            System.out.println("Char for provided Index "+ stringIndex+" is "+a[stringIndex]);

        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index is out of range : *");
        }
    }
    private static String decodeString(String characters) {
        StringBuilder decodedCharBuilder = new StringBuilder();
        int counter = 0;
        int num = 0;
        char c = 0;
        for(int i=0;i<characters.length();i++){
            if(i%2 != 0){
                num = Integer.parseInt(Character.toString(characters.charAt(i)));
            }else if(i%2 == 0){
                c = characters.charAt(i);
            }
            counter++;
            if(counter == 2){
                for(int j=0;j<num;j++){
                    decodedCharBuilder.append(c);
                }
                counter = 0;
            }

        }
        return decodedCharBuilder.toString();
    }

    private static String encodeString(char[] characters) {
        StringBuilder encodedCharBuilder = new StringBuilder();
        Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
        for (char c : characters) {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }else {
                charCountMap.put(c, 1);
            }
        }
        charCountMap.forEach((key,value)->{
            encodedCharBuilder.append(key);
            encodedCharBuilder.append(value);
        });
        return encodedCharBuilder.toString();
    }
}