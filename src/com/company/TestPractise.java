package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPractise {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.addAll(Arrays.asList("aaaaa", "bbbb", "ccc", "d", "eeee", "g", "h", "hh"));
        removeElementWithLengthEquals1(array);
        System.out.println(array);
    }
    public static void removeElementWithLengthEquals1 (ArrayList<String> list) {
        Pattern pattern = Pattern.compile("^\\w$");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){

            String value = iterator.next();
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()){

                iterator.remove();

            }

        }

        /*for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            if(matcher.find()) {
                list.remove(i);
                i--;
            }
        }*/
    }
}

