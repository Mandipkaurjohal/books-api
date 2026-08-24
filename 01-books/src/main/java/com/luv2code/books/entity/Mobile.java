package com.luv2code.books.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;


public class Mobile {

    private  String Brand;
   private String Model;
   private String Color;



   public  Mobile(String brand,String model,String color){
        Brand=brand;
        Model=model;
        Color=color;

   }



    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
    public  String getModel()
    {
        return Model;
    }
    public void  setModel(String model)// method type
    {
        Model= model;
    }
    public String getColor()
    {
        return Color;
    }
    public void setColor(String color)
    {
        Color=color;
    }
}
