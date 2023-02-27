/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingnetbeans;

/**
 *
 * @author papar
 */

public class TestingNetBeans {

    public static void main(String[] args) {
        Square sqr=new Square(10);
        Triangle tgl=new Triangle(20, 5);
        sqr.color="Blue";
        System.out.println(sqr.getShapeName());
        System.out.println(sqr.getSquarePicture());
        System.out.println("Square perimeter="+sqr.getSquarePerimeter());
        System.out.println("Triangle area="+tgl.getTriangleArea());
    }
}
