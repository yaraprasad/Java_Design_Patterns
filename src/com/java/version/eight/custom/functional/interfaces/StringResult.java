package com.java.version.eight.custom.functional.interfaces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringResult {


    public static void main(String[] args) {

        StringInterface sout = s -> s.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).toString();

        System.out.println(sout.performAction("Java1.0 Hashtable Java 5 var-args Java8 Streams, Java9 Modules , Java 7 try-catch, Java 17 Record"));



        StringInterface sout1 = s -> s.toLowerCase().chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(StringResult::categoryVowelsAndConsonants, Collectors.counting())).toString();
        System.out.println(sout1.performAction("#JAVA@26# LTS VERSION RELEASING SOON!!!"));

        StringInterface sout2 = s -> Arrays.stream(s.replaceAll("[^A-Za-z\\s]","").split(" "))
                .map(str-> new StringBuilder(str).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(sout2.performAction("Java is my programming language"));
    }

    public static TypeCategory categoryVowelsAndConsonants(char ch){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if(set.contains(ch) && Character.isAlphabetic(ch)){
            return TypeCategory.VOWEl;
        } else if (Character.isAlphabetic(ch) && !set.contains(ch) ) {
            return TypeCategory.CONSONANTS;
        } else if (Character.isDigit(ch) ) {
            return TypeCategory.NUMBER;
        } else if (Character.isSpaceChar(ch)) {
            return TypeCategory.WHITE_SPACE;
        }else {
            return TypeCategory.SPECIAL_CHARACTER;
        }
    }
}

