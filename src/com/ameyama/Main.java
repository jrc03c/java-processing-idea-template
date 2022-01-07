package com.ameyama;

import processing.core.*;

public class Main extends PApplet {
    public void setup(){
        size(100, 100);
        background(255, 0, 0);
        System.out.println("Yay!");
    }

    public void draw(){}

    public static void main(String[] args) {
        PApplet.main("com.ameyama.Main");
    }
}
