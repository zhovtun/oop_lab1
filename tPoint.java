package com.company;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Appearance;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;
import java.awt.*;


public class tPoint {
    private float posX;
    private float posY;
    private float colorR;
    private float colorG;
    private float colorB;

    public tPoint(float posX, float posY, float colorR, float colorG, float colorB) {
        this.posX = posX;
        this.posY = posY;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }

    public void setPosX(float x) {posX = x;}
    public void setPosY(float y) {posY = y;}
    public void  setColorR(float r) {colorR = r;}
    public void  setColorG(float g) {colorG = g;}
    public void  setColorB(float b) {colorB = b;}

    //public void showPoint () {System.out.println(posX + " " + posY + " " + colors);}

    public TransformGroup create (){
        Vector3f vector = new Vector3f(posX, posY, 0.0f);
        Transform3D transform =  new Transform3D();
        transform.setTranslation(vector);
        TransformGroup transformgroup = new TransformGroup(transform);
        Appearance ap = new Appearance();
        ColoringAttributes color = new ColoringAttributes();
        color.setColor(colorR, colorG, colorB);
        ap.setColoringAttributes(color);
        Sphere sp1 = new Sphere(0.005f, ap);
        transformgroup.addChild(sp1);
        return transformgroup;
    }
}
