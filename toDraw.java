package com.company;

import javax.swing.*;
import java.awt.*;


public class toDraw extends JPanel {
    private tPoint[] array = new tPoint[100];

    public toDraw(tPoint[] array) {
        this.array = array;
    }

    /*public void paint (Graphics g) {
        for (int i = 0; i < array.length; i++) {
            g.setColor(array[i].getColors());
            g.fillOval(array[i].getPosX(), array[i].getPosY(), 3, 3);
        }

    }*/
}
