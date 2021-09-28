package com.shiva.designpatterns.structural.flyweight.forest;

import java.awt.*;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-22 10:37
 **/
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }

}
