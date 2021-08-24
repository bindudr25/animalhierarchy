package com.fish;

public class Shark extends Fish{
    private String color = "grey";
    private String size = "large";

    public void eat(){
        System.out.println("I eat other fish");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
