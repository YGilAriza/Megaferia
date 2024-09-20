/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia;

import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Stand {
    
    private static int idCount = 0;
            
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
        
        Stand.idCount++;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + "(" + id+ ", "+ precio + ")";
    }
    public int getId() {
        return this.id;
    }

    
    
    
}
