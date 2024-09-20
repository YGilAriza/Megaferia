/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import megaferia.Megaferia;

/**
 *
 * @author examen
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        Megaferia megaferia = new Megaferia();
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        
        megaferia.verifyStands();
    }
}
