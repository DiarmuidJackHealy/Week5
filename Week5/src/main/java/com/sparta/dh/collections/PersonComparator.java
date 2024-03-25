package com.sparta.dh.collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int lastNameComparison = o1.getSecondName().compareTo(o2.getSecondName());
        if(lastNameComparison == 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return lastNameComparison;
        }
    }
}
