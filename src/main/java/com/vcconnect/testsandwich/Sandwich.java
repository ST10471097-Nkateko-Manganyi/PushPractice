/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vcconnect.testsandwich;

/**
 *
 * @author lab_services_student
 */
public class Sandwich {
    
    private String mainIngredient;
    private String breadType;
    private double price;

    //GETTER////
    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }

    //SETTER

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
}
