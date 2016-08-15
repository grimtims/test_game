package com.grimtims.testgame;

import android.graphics.Rect;

/**
 * Created by Graham on 2016-08-14.
 */
public abstract class GameObject {
    protected int x;
    protected int y;
    protected int dx;
    protected int dy;
    protected int width;
    protected int height;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setDx(int dx){
        this.dx = dx;
    }

    public void setDy(int dy){
        this.dy = dy;
    }

    public void width(int width){
        this.width = width;
    }

    public void height(int height){
        this.height = height;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDx(){
        return dx;
    }

    public int getDy(){
        return dy;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Rect getRectangle(){
        return new Rect(x, y, x+width, y+width);
    }

}
