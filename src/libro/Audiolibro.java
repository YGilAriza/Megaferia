/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.util.ArrayList;
import megaferia.Editorial;
import megaferia.personas.Autor;
import megaferia.personas.Narrador;

/**
 *
 * @author examen
 */
public class Audiolibro extends Libro{
    private int duracion;
    private Narrador narrador;

    public Audiolibro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
        
        this.narrador.addLibro(this);
    }
}
