package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        array.add("a");
        array.add("b");
        changeThisList(array);
        System.out.println(array);
    }

    public static void changeThisList(List<String> array) {
        array.add("c");
        array.remove("b");
        array.add("d");
        array = null;

    }
}
