/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testingnetbeans;

/**
 *
 * @author papar
 */
public class Triangle extends Shape{
    private int height,base;
    public Triangle(int height, int base){
        super("Triangle");
        
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
        
        if(base<0){
            this.base=0;
        }else{
            this.base=base;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base==69){
            System.out.println("Nice");
        }
        if(base<0){
            this.base=0;
        }else{
            this.base=base;
        }
    }
    
    public int getTriangleArea(){
        return height*base/2;
    }
}
