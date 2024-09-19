/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.util.ArrayList;
import megaferia.Editorial;
import megaferia.personas.Autor;

/**
 *
 * @author examen
 */
public abstract class Libro {
    protected String titulo;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected float valor;
    protected Editorial editorial;
    protected ArrayList<Autor> autores; 
}
