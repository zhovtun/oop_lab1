package com.company;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.pickfast.PickCanvas;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;
import javafx.scene.effect.ColorAdjust;

import javax.media.j3d.*;
import javax.swing.*;
import javax.vecmath.Vector3f;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;


public class toDraw3d {
    public toDraw3d () {

        JFrame frame = new JFrame("New Frame");
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas = new Canvas3D(config);
        canvas.setSize(600, 400);

        SimpleUniverse universe = new SimpleUniverse(canvas);
        BranchGroup group = new BranchGroup();

        Appearance ap = new Appearance();
        ColoringAttributes colors =  new ColoringAttributes();
        colors.setColor(0.1f, 0.2f, 0.3f);
        ap.setColoringAttributes(colors);

      /* Vector3f vector = new Vector3f(-0.3f, 0.2f, 0.0f);
        Transform3D transform =  new Transform3D();
        transform.setTranslation(vector);
        TransformGroup transformgroup = new TransformGroup(transform);
        Appearance ap1 = new Appearance();
        ColoringAttributes col2 = new ColoringAttributes();
        col2.setColor(0.6f, 0.2f, 0.9f);
        Sphere sp1 = new Sphere(0.005f, ap1);
        transformgroup.addChild(sp1);*/
        float p = 0.1f;
      for (int i = 1; i<10; i++ ) {
          p = (0.1f / i) * 3 ;

          tPoint pt1 = new tPoint(0.02f + p, 0.3f + p, 0.5f+p, 0.5f+p, 0.2f+p);
          group.addChild(pt1.create());
      }

        Sphere sphera = new Sphere(0.005f, 2, ap);
        //Sphere sp2 = new Sphere(0.1f, ap);
        group.addChild(sphera);


        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);


        frame.add(canvas);
        PickCanvas pickCanvas = new PickCanvas(canvas, group);

        frame.pack();
        frame.setVisible(true);
    }
}
