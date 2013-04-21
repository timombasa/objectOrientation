package main.java;

public class Rectangle {

    private int length = 0;
    private int width = 0;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    protected void setLength (int length) {
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }

    protected void setWidth(int width) {
        this.width = width;
    }
}
