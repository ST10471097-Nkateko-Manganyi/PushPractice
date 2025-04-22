/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vcconnect.testsandwich;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestSandwich {

    public static void main(String[] args) {
        
        Sandwich flavour = new Sandwich();  ///////OBJECT
        ///
        String mainIngredient = JOptionPane.showInputDialog("What is your main ingredient");
        
        String breadType = JOptionPane.showInputDialog("What type of bread would you like");
        
        String price = JOptionPane.showInputDialog("Your total will be? ");
         double priceValue = Double.parseDouble(price);
        
        
        ///Display///
        JOptionPane.showMessageDialog(null,"You have chosen " + mainIngredient + " as your main ingredient and " + breadType + " as your breadtype, this will come at a total of " + price);
    }
}
