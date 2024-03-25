package com.sparta.dh.generics;

public class App {
    public static void main(String[] args) {
        IntegerRectangle ir = new IntegerRectangle(2,4);
        System.out.printf("Integer Rectangle Area: %d\n", ir.getWidth() * ir.getHeight());

        DoubleRectangle dr = new DoubleRectangle(2.5,4.0);
        System.out.println("Double Rectangle Area: " + dr.getWidth() * dr.getHeight());

//        ObjectRectangle or = new ObjectRectangle(2.5, 1.5);
//        System.out.println("Object Rectangle Area: " + or.getWidth() * or.getHeight());
//        //Operators won't work on Object

        GenericRectangle<Double> gr = new GenericRectangle<>(1.5, 2.5);
        System.out.printf("Double Generic Rectangle Area: %f\n", gr.getWidth() * gr.getHeight());

    }
}
