/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia;

import java.util.ArrayList;
import libro.Libro;
import megaferia.personas.Gerente;

/**
 *
 * @author examen
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = new ArrayList<>();
        this.stands = new ArrayList<>();
        
        this.gerente.setEditorial(this);
    }
    
    
    
    
    public boolean AddLibro(Libro libro) {
        if(!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
    
}
