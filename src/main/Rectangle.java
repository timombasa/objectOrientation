package main;

public class Rectangle {

    private int length = 0;
    private int width = 0;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}
