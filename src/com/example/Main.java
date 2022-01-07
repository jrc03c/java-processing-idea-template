package com.example;

import processing.core.*;

public class Main extends PApplet {
    public void settings(){
        // the `size` function can only be used here!
        // (i.e., it can't be used in `setup`)
        size(512, 512);
    }

    public void setup(){
        // do some setup...
    }

    public void draw(){
        background(255, 0, 0);
    }

    public static void main(String[] args){
        PApplet.main("com.example.Main");
    }
}
