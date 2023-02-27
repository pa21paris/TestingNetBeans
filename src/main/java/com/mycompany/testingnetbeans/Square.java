/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testingnetbeans;

/**
 *
 * @author papar
 */
public class Square extends Shape{
    private int sideLength;
    public Square(int sideLength){
        super("Square");
        if(sideLength<0){
            this.sideLength=0;
        }else{
            this.sideLength=sideLength;
        }

    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if(sideLength<0){
            this.sideLength=0;
        }else{
            this.sideLength=sideLength;
        }
    }
    
    public int getSquareArea(){
        return sideLength*sideLength;
    }
    public int getSquarePerimeter(){
        return sideLength*4;
    }
    
    public String getSquarePicture(){
        String result="";
        for(int i=0;i<sideLength;i++){
            String line="";
            if(i==0 || i==sideLength-1){
                for(int j=0;j<sideLength;j++){
                    line+="-";
                }
            }else{
                line+="|";
                for(int j=0;j<sideLength-2;j++){
                    line+=" ";
                }
                line+="|";
            }
            result+=line+"\n";
        }
        return result;
    }
}
