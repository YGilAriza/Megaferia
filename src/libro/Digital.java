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
public class Digital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos; 
    
    public Digital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, boolean hasHipervinculo, ArrayList<String> Hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = Hipervinculos;
    }
}
