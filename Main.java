package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.util.Random;
import java.lang.String;



public class Main {

    public static void main(String[] args) {
        /*int size = 100;
        Random random = new Random();

        tPoint[] array = new tPoint[size];
        Color[] randColor = {Color.BLACK, Color.BLUE, Color.CYAN, Color.YELLOW,
                Color.GREEN, Color.GRAY, Color.RED, Color.BLUE, Color.PINK, Color.DARK_GRAY};

        for (int i = 0; i < array.length; i++) {
            int position = random.nextInt(randColor.length);
            array[i] = new tPoint(random.nextInt(500), random.nextInt(500), randColor[position]);
            //array[i].showPoint();
        }

        MyWindow frame = new MyWindow("Experienced window");
        toDraw dr1 = new toDraw(array);
        frame.add(dr1);
        frame.setVisible(true);*/

        System.setProperty("sun.awt.noerasebackground", "true");
        new toDraw3d();

    }
}