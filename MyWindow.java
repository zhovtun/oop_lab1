package com.company;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    MyWindow(String string){
        super(string);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setDefaultLookAndFeelDecorated(true);
        setBackground(Color.WHITE);
        //pack();
    }
}

