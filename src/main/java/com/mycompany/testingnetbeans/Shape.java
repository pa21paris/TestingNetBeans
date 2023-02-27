/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testingnetbeans;

/**
 *
 * @author papar
 */
public class Shape {
    private static int shapesQuantity=0;
    private String name;
    String color;
    
    static int getShapesQuantity(){
        return shapesQuantity;
    }
    
    public String getShapeName(){
        return this.name;
    }
    
    public void setShapeColor(String color){
        this.color=color;
    }
    
    public String getShapeColor(){
        return this.color;
    }
    
    public Shape(String name){
        shapesQuantity++;
        this.name=name;
    }
}