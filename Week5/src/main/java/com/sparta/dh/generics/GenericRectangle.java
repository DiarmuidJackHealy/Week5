package com.sparta.dh.generics;

public class GenericRectangle<T> {
    private T width;
    private T height;

    public GenericRectangle(T width, T height) {

    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }


}
