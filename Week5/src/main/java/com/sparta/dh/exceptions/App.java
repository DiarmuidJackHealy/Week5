package com.sparta.dh.exceptions;

import java.nio.charset.IllegalCharsetNameException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal("Kruger",9);

        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Dog's name: " + dog.getName());

        try {
            dog.setDob("eeeeeeeeeee");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Parse Exception");
        } catch (IllegalCharsetNameException e)  {
            e.printStackTrace();
            System.out.println("Illegal Charset Name Exception");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        } finally {
            System.out.println("Finally blocks run no matter what!");
        }
    }
}
