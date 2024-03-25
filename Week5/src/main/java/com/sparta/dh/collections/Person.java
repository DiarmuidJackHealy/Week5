package com.sparta.dh.collections;

public class Person implements Comparable<Person>{
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                "secondName='" + secondName + '\'' +
                '}';
    }
    public int compareTo(Person o) {
        int lastNameComparison = secondName.compareTo(o.secondName);
        if(lastNameComparison == 0) {
            return firstName.compareTo(o.firstName);
        } else {
            return lastNameComparison;
        }
    }
}
