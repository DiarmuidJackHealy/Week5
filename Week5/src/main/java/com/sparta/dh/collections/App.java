package com.sparta.dh.collections;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Leonardo", "Donatello", "Michaelangelo", "Raphael"));
        Collections.sort(names);
        System.out.println(names);

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("DJ", "Healy"));
        people.add(new Person("Jack", "Healy"));
        people.add(new Person("Diarmuid", "Healy"));
        people.add(new Person("DJ", "Healy"));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);


//        List<String> menu = Arrays.asList(
//                "Classic Burger", "BBQ Chicken Burger", "Spicy Beef Burger", "Veggie Burger",
//                "Mac & Cheese", "Cod & Chips", "Vegetable Chilli", "Beef Lasagne", "Steak & Ale Pie",
//                "Hunters Chicken", "Gammon Steak", "8oz Aged Rump", "Mixed Grill"
//        );
//        List<String> mealsIFancy = Arrays.asList(
//                "Roast Lunch", "Chicken Madras", "Cod & Chips", "Vegetable Chilli", "Cottage Pie",
//                "Steak & Ale Pie", "Beans on Toast", "Classic Burger", "Beef Lasagne"
//        );
//        NavigableSet<String> mergedList = new TreeSet<>(menu);
//        mergedList.retainAll(mealsIFancy);
//        for(String meal : mergedList.descendingSet()) {
//            System.out.println(meal);
//        }






//        HashSet<String> names = new HashSet<>(
//                List.of("Boggis", "Bunce", "Bean", "Ash", "Kristofersen")
//        );
//        HashSet<String> moreNames = new HashSet<>(
//                List.of("Tyson", "Mike", "Bean", "Ash", "Paul")
//        );
//
//        for(String name : names) {
//            System.out.println(name);
//        }
//        for(String name : moreNames) {
//            System.out.println(name);
//        }
//
//        HashSet<String> allNames = new HashSet();
//        allNames.addAll(names);
//        allNames.addAll(moreNames);
//        System.out.println(allNames);

//        names.add("Foxy");
//        names.add("Ash");
//        System.out.println(names);
    }
    public HashMap<Character, Integer> lettersCount() {
        String message = "The cat in the hat comes back".replaceAll("\\s+", "").toLowerCase();
        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (char letter : message.toCharArray()) {
            if (lettersCount.containsKey(letter)) {
                lettersCount.put(letter, lettersCount.get(letter) + 1);
            } else {
                lettersCount.put(letter, 1);
            }
        }
        return lettersCount;
    }
}
