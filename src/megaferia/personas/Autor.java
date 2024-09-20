/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.personas;

import java.util.ArrayList;
import libro.Libro;

/**
 *
 * @author examen
 */
public class Autor extends Persona {
    private ArrayList<Libro> libros;
    
    public Autor(String nombre, int cedula, ArrayList<Libro> libros) {
            super(nombre, cedula);
            this.libros = libros;
        }
    
    public boolean addLibro(Libro libro) {
        if(!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }
}
