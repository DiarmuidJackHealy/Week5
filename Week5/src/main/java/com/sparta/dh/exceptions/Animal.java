package com.sparta.dh.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private Date dob;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public String getName() {
        try {
            return name.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void setDob(String dateString) throws ParseException {
        dob = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
    }

    public void setAge(int newAge) {
        if(newAge >= 0) {
            age = newAge;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dob=" + dob +
                '}';
    }
}
